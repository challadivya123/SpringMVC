package com.mycompany.springcore.annotation.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mycompany.springcore.annotation.componentscan.*;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Customer customer=(Customer)context.getBean("customer");
customer.showCustomerDetails();
	}

}
