package com.bolsadeideas.pruebafabio.app.models.service;

import java.util.List;

import javax.validation.Valid;

import com.bolsadeideas.pruebafabio.app.models.entity.CreditCard;

public interface ICreditCardService {

	public List<CreditCard> findByUserCode(Long id);

	public String deleteByToken(String token);

	public String save(@Valid CreditCard card);

	public String update(@Valid CreditCard card);

}
