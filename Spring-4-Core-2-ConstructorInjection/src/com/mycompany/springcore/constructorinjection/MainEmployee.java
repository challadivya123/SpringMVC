package com.mycompany.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee emp=(Employee)context.getBean("emp");
System.out.println("Employee Details");
System.out.println(emp.getId()+"--"+emp.getName());
System.out.println("Address of Employee");
System.out.println(emp.getAddress().getCity());
	}

}
