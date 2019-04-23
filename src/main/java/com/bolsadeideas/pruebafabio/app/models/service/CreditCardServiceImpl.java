package com.bolsadeideas.pruebafabio.app.models.service;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.pruebafabio.app.SOAPConnector;
import com.bolsadeideas.pruebafabio.app.models.dao.ICreditCardDao;
import com.bolsadeideas.pruebafabio.app.models.entity.CreditCard;
import com.bolsadeideas.pruebafabio.app.models.schemas.CreditCardGetByUserCodeRequest;
import com.bolsadeideas.pruebafabio.app.models.schemas.CreditCardGetByUserCodeResponse;

@Service
public class CreditCardServiceImpl implements ICreditCardService {

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	private ICreditCardDao CreditCardDao;

	@Override
	public List<CreditCard> findByUserCode(Long id) {

		CreditCardGetByUserCodeRequest request = new CreditCardGetByUserCodeRequest();
		request.setCode(String.valueOf(id));
		CreditCardGetByUserCodeResponse response = (CreditCardGetByUserCodeResponse) soapConnector
				.callWebService("http://18.222.184.108:8080/ws/Test", request);

		List<CreditCard> creditCards = new ArrayList<CreditCard>();

		for (com.bolsadeideas.pruebafabio.app.models.schemas.CreditCard card : response.getCreditCards()) {

			CreditCard creditCard = CreditCardDao.findCreditCardrByToken(card.getToken());

			if (creditCard == null) {
				creditCard = new CreditCard();

				creditCard.setExpDate(card.getExpDate());
				creditCard.setFranchise(card.getFranchise().toString());
				creditCard.setNumber(card.getNumber());
				creditCard.setToken(card.getToken());

			}

			CreditCardDao.save(creditCard);
			creditCards.add(creditCard);

		}

		return creditCards;

	}

	@Override
	public String deleteByToken(String token) {
		
		CreditCard creditCard = CreditCardDao.findCreditCardrByToken(token);
		if (creditCard == null) {
			return "la tarjeta no existe";
		}
		CreditCardDao.delete(creditCard);
		return "Se elimino la tarjeta correctamente";
	}

	@Override
	public String save(@Valid CreditCard card) {
		CreditCard creditCard = CreditCardDao.findCreditCardrByToken(card.getToken());
		if (creditCard != null) {
			return "la tarjeta ya existe";
		}
		CreditCardDao.save(card);
		return "Se creo la tarjeta correctamente";
	}

	@Override
	public String update(@Valid CreditCard card) {
		CreditCard creditCard = CreditCardDao.findCreditCardrByToken(card.getToken());
		if (creditCard == null) {
			return "no se puede actualizar";
		}
		creditCard.setExpDate(card.getExpDate());
		creditCard.setFranchise(card.getFranchise());
		creditCard.setNumber(card.getNumber());
		return "Se edito la tarjeta correctamente";
	}

}
