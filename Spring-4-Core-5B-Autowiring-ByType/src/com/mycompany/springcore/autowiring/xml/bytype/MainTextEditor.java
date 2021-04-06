package com.mycompany.springcore.autowiring.xml.bytype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainTextEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		TextEditor txtEditor=(TextEditor) context.getBean("textEditor");
			txtEditor.showMessage();
			}
	}


