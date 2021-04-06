package com.hcl.petpeers.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.petpeers.model.User;
import com.hcl.petpeers.repository.UserRegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserRegisterDao userRegisterDaoImpl;
	@Override
	public String RegisterUserDetails(User user) {
		
		return userRegisterDaoImpl.getUserDetails(user);
	}

}
