package com.mycom.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
obj.getMessage();
context.registerShutdownHook();//ensure a graceful shutdown and call the relevant destroy methods
	}

}
