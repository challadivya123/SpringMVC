package com.mycompany.springcore.setterinjection.collections.list;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
Employee emp=(Employee) context.getBean("emp");
List<String> nameList=(List<String>) emp.getEmpNameList();
System.out.println("Employee Names-List");
for(String name:nameList) {
	System.out.println(name);
}
	}

}
