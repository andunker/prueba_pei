package com.bolsadeideas.pruebafabio.app.models.dao;

import java.math.BigDecimal;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.bolsadeideas.pruebafabio.app.models.entity.Movement;

public interface IMovementDao  extends CrudRepository<Movement, Long> {

	@Query("from Movement where token=:token and amount=:amount and date=:date and type=:type")
	Movement findMovementbyFields(@Param("amount") BigDecimal amount, @Param("date") String date, @Param("token") String token, @Param("type") String type);
	
}
