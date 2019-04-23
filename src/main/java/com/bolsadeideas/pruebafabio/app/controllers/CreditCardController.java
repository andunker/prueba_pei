package com.bolsadeideas.pruebafabio.app.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.pruebafabio.app.models.entity.CreditCard;
import com.bolsadeideas.pruebafabio.app.models.service.ICreditCardService;

@RestController
@RequestMapping("/api/creditcard")
public class CreditCardController {
	
	@Autowired
	private ICreditCardService creditCardService; 
	
	@RequestMapping(value="/user/{id}",  method=RequestMethod.GET, produces = "application/json")
	public List<CreditCard> findByUserCode(@PathVariable(value="id") Long id) { 
		return	creditCardService.findByUserCode(id);
	}
	
	@RequestMapping(value="/",  method=RequestMethod.DELETE, produces = "application/json")
	public String deleteByToken(@RequestParam(value="token") String token) { 
		return	creditCardService.deleteByToken(token);
	}

	@RequestMapping(value="/",  method=RequestMethod.POST, produces = "application/json")
	public String save(@Valid CreditCard card) { 
		return creditCardService.save(card);
	}
	
	@RequestMapping(value="/",  method=RequestMethod.PUT, produces = "application/json")
	public String update(@Valid CreditCard card) { 
		return creditCardService.update(card);
	}
}
