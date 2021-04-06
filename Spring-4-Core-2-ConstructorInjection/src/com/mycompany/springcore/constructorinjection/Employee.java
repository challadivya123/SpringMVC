package com.mycompany.springcore.constructorinjection;

public class Employee {
int id;
String name;
Address address;//dependency -HAS-A
Employee(int id,String name,Address address){
	this.id=id;
	this.name=name;
	this.address=address;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}

public Address getAddress() {
	return address;
}


}
