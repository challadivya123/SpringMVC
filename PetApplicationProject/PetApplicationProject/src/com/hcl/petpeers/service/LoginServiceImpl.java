package com.hcl.petpeers.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petpeers.model.User;
import com.hcl.petpeers.repository.LoginDao;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDaoImpl;
	@Override
	public User validateLogin(User user) {
		return loginDaoImpl.verifyUser(user);
		
	}

}