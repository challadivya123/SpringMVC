package com.mycompany.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee emp=(Employee)context.getBean("emp");
System.out.println(emp.getId()+"__"+emp.getName());
System.out.println("Address of employee");

System.out.println("Flat No:"+emp.address.getFlatno());
System.out.println("Area:"+emp.address.getArea());
System.out.println("City:"+emp.address.getCity());
	}

}
