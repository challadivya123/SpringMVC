package com.mycompany.springcore.autowired.annotation.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTextEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
TextEditor te=(TextEditor)context.getBean("textEditor");
te.spellCheck();
	}

}
