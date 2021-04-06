package com.mycompany.springcore.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student2")
private Student student;
public Profile() {
	System.out.println("Inside profile constructor");
}
public void printAge() {
	System.out.println("Age:"+student.getAge());
	
}
public void printName() {
	System.out.println("Name:"+student.getName());
}
}
