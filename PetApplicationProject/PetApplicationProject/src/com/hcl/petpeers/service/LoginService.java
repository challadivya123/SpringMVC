package com.hcl.petpeers.service;


import com.hcl.petpeers.model.User;

public interface LoginService {

	User validateLogin(User user);
	
}
