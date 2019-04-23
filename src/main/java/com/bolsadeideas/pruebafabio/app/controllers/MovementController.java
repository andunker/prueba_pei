package com.bolsadeideas.pruebafabio.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.bolsadeideas.pruebafabio.app.models.schemas.CreditCardWithMovements;
import com.bolsadeideas.pruebafabio.app.models.service.IMovementService;
import com.bolsadeideas.pruebafabio.app.models.entity.Movement;

@RestController
@RequestMapping("/api/movement")
public class MovementController {

	@Autowired
	private IMovementService movementService; 
	
	
	@RequestMapping(value="/token",  method=RequestMethod.GET, produces = "application/json")
	public List<com.bolsadeideas.pruebafabio.app.models.schemas.Movement> findByToken(@RequestHeader("token") String token) { 
		return	movementService.findByToken(token);
	}
	
	
	@RequestMapping(value="/user/{id}",  method=RequestMethod.GET, produces = "application/json")
	public List<CreditCardWithMovements> findByUserCode(@PathVariable(value="id") Long id) { 
		return	movementService.findByUserCode(id);
	}
	
	
	
	@RequestMapping(value="/",  method=RequestMethod.DELETE, produces = "application/json")
	public String delete(@Valid Movement movement) { 
		return	movementService.delete(movement);
	}

	@RequestMapping(value="/",  method=RequestMethod.POST, produces = "application/json")
	public String save(@Valid Movement movement) { 
		return movementService.save(movement);
	}
	
	@RequestMapping(value="/",  method=RequestMethod.PUT, produces = "application/json")
	public String update(@Valid Movement movement) { 
		return movementService.update(movement);
	}
	
	
	
	
	
	
}
