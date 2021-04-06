package com.mycom.hibernate.nativequery;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class MainApp {
	private static SessionFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

Session session=factory.openSession();
Transaction tx=null;
try {
	tx=session.beginTransaction();
	String sql="Select * from Employee";//sql synax
	SQLQuery query=session.createSQLQuery(sql);
	query.addEntity(Employee.class);
	List<Employee> employeeList=query.list();
	
	for(Employee employee:employeeList) {
		System.out.println("First Name:"+employee.getId());
		System.out.println("Last Name:"+employee.getName());
		System.out.println("Salary:"+employee.getSalary());
	}
	tx.commit();
	
}catch(HibernateException e) {
	if(tx!=null)
		tx.rollback();
	e.printStackTrace();
}finally {
	session.close();
}
	}

}
