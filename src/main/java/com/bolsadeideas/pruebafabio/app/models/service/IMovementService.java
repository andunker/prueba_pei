package com.bolsadeideas.pruebafabio.app.models.service;

import java.util.List;

import javax.validation.Valid;

import com.bolsadeideas.pruebafabio.app.models.entity.Movement;
import com.bolsadeideas.pruebafabio.app.models.schemas.CreditCardWithMovements;

public interface IMovementService {

	public List<com.bolsadeideas.pruebafabio.app.models.schemas.Movement> findByToken(String token);

	public List<CreditCardWithMovements> findByUserCode(Long id);

	public String save(@Valid Movement movement);

	public String update(@Valid Movement movement);
	
	public String delete(@Valid Movement movement);

}
