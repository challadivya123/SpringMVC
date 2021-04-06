package com.mycompany.springcore.annotation.componentscan;

import org.springframework.stereotype.Component;

@Component
public class Customer {
public void showCustomerDetails() {
	System.out.println("Name:Divya");
	System.out.println("City:Nellore");
}
}
