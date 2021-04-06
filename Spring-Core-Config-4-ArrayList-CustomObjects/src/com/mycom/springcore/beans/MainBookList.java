package com.mycom.springcore.beans;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mycom.springcore.config.ApplicationConfig;

public class MainBookList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("resource")
ApplicationContext appContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//read book details
List<Book> bookList=(List<Book>)appContext.getBean("bookList");
System.out.println("Book Details:\n");
for(Book book:bookList) {
	System.out.println(book.getId()+"\t"+book.getName()+"\t"+book.getAuthor()+"\t"+book.getPrice());
}
	}

}
