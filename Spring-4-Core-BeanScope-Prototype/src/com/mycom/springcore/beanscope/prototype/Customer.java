package com.mycom.springcore.beanscope.prototype;



public class Customer {
	int id;
	String name;
	String city;
	static int count=0;
	{//non static block
		count++;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customer.count = count;
	}

	}


