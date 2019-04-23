package com.bolsadeideas.pruebafabio.app.models.service;

import com.bolsadeideas.pruebafabio.app.models.entity.User;

public interface IUserService {

	public User login(String username, String password);

}
