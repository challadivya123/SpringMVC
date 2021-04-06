package com.mycom.springcore.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationConfig {
@Bean(name="cityList")
public List<String>cityList(){
	Scanner scnr=new Scanner(System.in);
	List<String> cList=new ArrayList<String>();
	//like property,value attributes in appconfig.xml
	cList.add("Pune");
	cList.add("Bengaluru");
	cList.add("Hyderabad");
	
	System.out.println("Enter another 2 city names");
	cList.add(scnr.nextLine());
	cList.add(scnr.nextLine());
	return cList;
}
}
