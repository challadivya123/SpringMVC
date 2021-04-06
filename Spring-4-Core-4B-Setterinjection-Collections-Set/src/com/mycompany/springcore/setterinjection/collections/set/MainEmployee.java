package com.mycompany.springcore.setterinjection.collections.set;


import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;





public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee) context.getBean("emp");
		Set<String> nameList=(Set<String>) emp.getEmpNameSet();
		System.out.println("Employee Names-Set");
		for(String name:nameList) {
			System.out.println(name);
		}
	}

}
