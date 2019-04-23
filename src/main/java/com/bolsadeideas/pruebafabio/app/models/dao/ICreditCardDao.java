package com.bolsadeideas.pruebafabio.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.bolsadeideas.pruebafabio.app.models.entity.CreditCard;


public interface ICreditCardDao extends CrudRepository<CreditCard, Long>  {

	@Query("from CreditCard where token=:token")
	CreditCard findCreditCardrByToken(@Param("token") String token);
	
}
