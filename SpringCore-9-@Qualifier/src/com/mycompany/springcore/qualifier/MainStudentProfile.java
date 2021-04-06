package com.mycompany.springcore.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudentProfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Profile profile=(Profile)context.getBean("profile");
profile.printAge();
profile.printName();
	}

}
