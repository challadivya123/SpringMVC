package com.hcl.petpeers.repository;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.petpeers.model.User;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	SessionFactory sessionFactory;
	

	@Override
	public User verifyUser(User user) {
		 Session session=sessionFactory.getCurrentSession();
		 System.out.println(user.getUserEmail());
		 System.out.println(user.getPassWord());
		 String query="from user.u where u.emailId=:emailId and u.passWord=:passWord";
		 User verified=(User) session.createQuery(query).setParameter("emailId",user.getUserEmail()).setParameter("passWord",user.getPassWord()).uniqueResult();
		 if(verified!=null) {
			 System.out.println(verified.getUserEmail());
			 return verified;
		 } else {
			 return null;
		 }
		 
	}


	
	

}