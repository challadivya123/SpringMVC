package com.mycom.springcore.config.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycom.springcore.config.ApplicationConfig;

public class MainCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext appContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Country country=(Country) appContext.getBean("country");
		
		String countryName=country.getCountryName();
		System.out.println("Country name: " +countryName);
		
		
		
	}

}
