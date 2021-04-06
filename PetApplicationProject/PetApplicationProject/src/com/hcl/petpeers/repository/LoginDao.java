package com.hcl.petpeers.repository;


import com.hcl.petpeers.model.User;

public interface LoginDao {

 User verifyUser(User user);
	
}
