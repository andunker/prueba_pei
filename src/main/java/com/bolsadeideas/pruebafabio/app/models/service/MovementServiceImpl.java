package com.bolsadeideas.pruebafabio.app.models.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.pruebafabio.app.SOAPConnector;
import com.bolsadeideas.pruebafabio.app.models.dao.IMovementDao;
import com.bolsadeideas.pruebafabio.app.models.entity.Movement;
import com.bolsadeideas.pruebafabio.app.models.schemas.CreditCardWithMovements;
import com.bolsadeideas.pruebafabio.app.models.schemas.MovementGetByCreditCardTokenRequest;
import com.bolsadeideas.pruebafabio.app.models.schemas.MovementGetByCreditCardTokenResponse;
import com.bolsadeideas.pruebafabio.app.models.schemas.MovementGetByUserCodeRequest;
import com.bolsadeideas.pruebafabio.app.models.schemas.MovementGetByUserCodeResponse;

@Service
public class MovementServiceImpl implements IMovementService {

	@Autowired
	SOAPConnector soapConnector;

	@Autowired
	private IMovementDao MovementDao;

	@Override
	public List<com.bolsadeideas.pruebafabio.app.models.schemas.Movement> findByToken(String token) {
		MovementGetByCreditCardTokenRequest request = new MovementGetByCreditCardTokenRequest();
		request.setToken(token);
		MovementGetByCreditCardTokenResponse response = (MovementGetByCreditCardTokenResponse) soapConnector
				.callWebService("http://18.222.184.108:8080/ws/Test", request);

		MovementDao.deleteAll();
		for (com.bolsadeideas.pruebafabio.app.models.schemas.Movement movement : response.getMovements()) {
			Movement movementVo = new Movement();
			movementVo.setAmount(movement.getAmount());
			movementVo.setDate(movement.getDate().toString());
			movementVo.setType(movement.getType().toString());
			movementVo.setToken(token);

			MovementDao.save(movementVo);

		}

		return response.getMovements();
	}

	@Override
	public List<CreditCardWithMovements> findByUserCode(Long id) {
		MovementGetByUserCodeRequest request = new MovementGetByUserCodeRequest();
		request.setCode(String.valueOf(id));
		MovementGetByUserCodeResponse response = (MovementGetByUserCodeResponse) soapConnector
				.callWebService("http://18.222.184.108:8080/ws/Test", request);
		return response.getCreditCards();
	}

	
	
	@Override
	public String delete(@Valid Movement movement) {
		
		Movement move = MovementDao.findMovementbyFields(movement.getAmount(),movement.getDate(),movement.getToken(), movement.getType());
		if (move == null) {
			return "el movimiento no existe";
		}
		MovementDao.delete(move);
		return "Se elimino correctamente el movimiento";
	}
	
	
	@Override
	public String save(@Valid Movement movement) {
		Movement move = MovementDao.findMovementbyFields(movement.getAmount(),movement.getDate(),movement.getToken(), movement.getType());
		if (move != null) {
			return "el movimiento existe";
		}
		MovementDao.save(movement);
		return "Se guardo el movimiento correctamente";
	}

	@Override
	public String update(@Valid Movement movement) {
		Movement move = MovementDao.findMovementbyFields(movement.getAmount(),movement.getDate(),movement.getToken(), movement.getType());
		if (move == null) {
			return "no se puede actualizar";
		}
		move.setAmount(movement.getAmount());
		move.setDate(movement.getDate());
		move.setType(movement.getType());
		
		return  "Se guardo el movimiento correctamente";
	}

}
