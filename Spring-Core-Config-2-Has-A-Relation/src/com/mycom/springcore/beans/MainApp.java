package com.mycom.springcore.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycom.springcore.config.ApplicationConfig;



public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		TextEditor textEditor=ctx.getBean(TextEditor.class);
		textEditor.spellChecker();
			}
	}


