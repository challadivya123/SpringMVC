package com.hcl.library.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.hcl.library.entity.Book;
import com.hcl.library.service.BookServiceProvider;

public class BookUi {
public static void main(String[] args)throws ClassNotFoundException,SQLException{
	Book book=new Book();
	ArrayList<Book> bookList=new ArrayList<Book>();
	BookServiceProvider bookServiceProvider=new BookServiceProvider();
	Scanner scnr=new Scanner(System.in);
			int choice;
	while(true) {
		System.out.println("1.Add book details\n 2.Show book details\n 3.Delete book\n4.Update book\n 5.exit\n");
	System.out.println("Enter your choice");
	choice=scnr.nextInt();
	scnr.hasNextLine();
	switch(choice) {
	case 1:
		book=null;
		book=new Book();
		System.out.println("Enter book id,book name,author,price);");
		book.setBokId(scnr.nextInt());
		scnr.nextLine();
		book.setBname(scnr.nextLine());;
		book.setAuthor(scnr.nextLine());
		book.setPrice(scnr.nextFloat());
		
		bookServiceProvider.insertBookSerivce(book);
		break;
	case 2:
		bookList=bookServiceProvider.getBookService();
		bookServiceProvider.showBooksService(bookList);
		break;
	case 5:
		System.exit(0);
		break;
	}
	}
}
}
