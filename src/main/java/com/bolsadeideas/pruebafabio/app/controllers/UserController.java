package com.bolsadeideas.pruebafabio.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bolsadeideas.pruebafabio.app.models.entity.User;
import com.bolsadeideas.pruebafabio.app.models.service.IUserService;



@RestController
@RequestMapping("/api/user")
public class UserController {

	
	@Autowired
	private IUserService userService; 
	
	@RequestMapping(value="/login",  method=RequestMethod.GET, produces = "application/json")
	public User login(@RequestHeader("username") String username, @RequestHeader("password") String password) { 
		return	userService.login(username, password);
	}
	
}
