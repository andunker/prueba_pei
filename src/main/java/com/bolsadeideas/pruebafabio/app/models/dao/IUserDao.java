package com.bolsadeideas.pruebafabio.app.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.bolsadeideas.pruebafabio.app.models.entity.User;


public interface IUserDao extends CrudRepository<User, Long>  {
	
	@Query("from User where code=:code")
	User findUserByCode(@Param("code") String code);

}
