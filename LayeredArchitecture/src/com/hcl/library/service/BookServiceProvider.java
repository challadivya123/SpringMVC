package com.hcl.library.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hcl.library.dao.BookAO;

import com.hcl.library.entity.Book;

public class BookServiceProvider {
ArrayList<Book> bookList=new ArrayList<Book>();
BookAO bookAO=new BookAO();
//reading book data service
public ArrayList<Book>getBookService() throws ClassNotFoundException, SQLException{
	bookList=bookAO.getBooks();
	return bookList;
}
//showing book data service
public void showBooksService(ArrayList<Book>bookList)throws ClassNotFoundException,SQLException{
	bookList=bookAO.getBooks();
	bookAO.showBookList(bookList);
	
}
//inserting book data service
public void insertBookSerivce(Book book)throws ClassNotFoundException,SQLException{
	bookAO.insertBookDetails(book);
}
}
