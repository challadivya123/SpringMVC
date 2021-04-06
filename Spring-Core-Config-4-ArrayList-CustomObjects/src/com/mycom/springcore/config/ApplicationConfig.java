package com.mycom.springcore.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mycom.springcore.beans.Book;

@Configuration
public class ApplicationConfig {
@Bean(name="bookList")
public List<Book>bookList(){
	Scanner scnr=new Scanner("System.in");
	List<Book> bookList=new ArrayList<Book>();
	System.out.println("Enter 2 book details-id,name,author,price");
	for(int count=1;count<=2;count++) {
		int id=scnr.nextInt();
		scnr.nextLine();
		String name=scnr.nextLine();
		String author=scnr.nextLine();
		float price=scnr.nextFloat();
		scnr.nextLine();
		bookList.add(new Book(id,name,author,price));
	}
	return bookList;
}
}
