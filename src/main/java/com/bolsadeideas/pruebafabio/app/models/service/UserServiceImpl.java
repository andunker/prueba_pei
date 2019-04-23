package com.bolsadeideas.pruebafabio.app.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.pruebafabio.app.SOAPConnector;
import com.bolsadeideas.pruebafabio.app.models.dao.IUserDao;
import com.bolsadeideas.pruebafabio.app.models.entity.User;
import com.bolsadeideas.pruebafabio.app.models.schemas.UserLoginRequest;
import com.bolsadeideas.pruebafabio.app.models.schemas.UserLoginResponse;


@Service
public class UserServiceImpl implements IUserService  {

	@Autowired 
	SOAPConnector soapConnector;
	
	@Autowired 
	private IUserDao UserDao;
	
	@Override
	public User login(String username, String password) {
		
		
		UserLoginRequest request = new UserLoginRequest();
        request.setUsername(username);
        request.setPassword(password);
        UserLoginResponse response =(UserLoginResponse) soapConnector.callWebService("http://18.222.184.108:8080/ws/Test", request);
        
        User user =UserDao.findUserByCode(response.getUser().getCode());
         
        if(user == null){
        	return null;
         }
            
		UserDao.save(user);
		return user;
	}

}
