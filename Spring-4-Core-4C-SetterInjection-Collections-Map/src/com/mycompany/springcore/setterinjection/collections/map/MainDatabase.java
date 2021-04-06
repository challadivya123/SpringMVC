package com.mycompany.springcore.setterinjection.collections.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDatabase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Database db=(Database) context.getBean("db");
db.show();
	}

}
