package com.mycom.springcore.beans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycom.springcore.config.ApplicationConfig;

public class MainCityList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext appContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
List<String> cityList=(List<String>)appContext.getBean("cityList");
for(String city:cityList) {
	System.out.println(city);
}
	}

}
