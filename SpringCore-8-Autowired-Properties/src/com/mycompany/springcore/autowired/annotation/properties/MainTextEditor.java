package com.mycompany.springcore.autowired.annotation.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainTextEditor {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor te=(TextEditor)context.getBean("textEditor");
		te.spellCheck();
		}
		}

