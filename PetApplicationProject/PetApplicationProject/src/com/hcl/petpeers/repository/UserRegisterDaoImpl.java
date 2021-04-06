package com.hcl.petpeers.repository;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.petpeers.model.User;

@Repository
public class UserRegisterDaoImpl implements UserRegisterDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Transactional
	@Override
	public String getUserDetails(User user) {
		
		
		String message1="Successfully Registered";
		String message2="User Already Exsisted Registration failed";
		Session session=sessionFactory.getCurrentSession();
		String query="from User u WHERE u.email=:email";
		List<User> exist_User=session.createQuery(query).setParameter("email", user.getUserEmail()).list();
		if(exist_User.isEmpty()) {
			session.save(user);
			return message1;
		} else {
			return message2;
		}
	}


	
}