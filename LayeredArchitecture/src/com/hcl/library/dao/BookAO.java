package com.hcl.library.dao;
//persistence layer
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.hcl.library.entity.Book;
import com.hcl.library.helper.DbConnector;

public class BookAO {
	//jdbc api classes for data retrieval
	private Connection connection=null;
	private PreparedStatement pstatement=null;
	private ResultSet resultSet=null;
	//Book book=new Book();
	ArrayList<Book> bookList=null;
	private static String bookQry="select *from book";
	public ArrayList<Book>getBooks() throws ClassNotFoundException,SQLException{
try {
	//opn the connection
	connection=DbConnector.createConnection();
	//create pstatement
	pstatement=connection.prepareStatement(bookQry);
	//get the result
	resultSet=pstatement.executeQuery();
	Book book;
	bookList=new ArrayList<Book>();
	while(resultSet.next()) {
		int bookId;
		String bookName;
		String author;
		float price;
		//declare the pojo
		book=new Book();
		//get the row details
		bookId=resultSet.getInt(1);
		bookName=resultSet.getString(2);
		author=resultSet.getString(3);
		price = resultSet.getFloat(4);
		
		//set the pojo with retrived values from the row
		book.setBokId(bookId);
		book.setBname(bookName);
		book.setAuthor(author);
		book.setPrice(price);
		//add the book to booklist
		bookList.add(book);
		book=null;
	}//end of while loop
	//dbConnector.closeConnection();
}catch(SQLException sqlex) {
}finally {
	//close connection
	//now data in arraylist obj no need to keep the connectio opened
	DbConnector.closeConnection();
}
return bookList;
	}

	
	
	//Show list of books//
	public void showBookList(ArrayList<Book>bookList2) {
		for(Book book:bookList2) {
			System.out.println(book.getBokId());
			System.out.println(book.getBname());
		}
	}
	
	
	
	
	
	
	//inserting book details//
	public void insertBookDetails(Book book)throws ClassNotFoundException,SQLException{
		connection=DbConnector.createConnection();
		
		String insQry="insert into book values(?,?,?,?)";
		pstatement=connection.prepareStatement(insQry);
		
		pstatement.setInt(1, book.getBokId());
		pstatement.setString(2, book.getBname());
		pstatement.setString(3, book.getAuthor());
		pstatement.setFloat(4, book.getPrice());
		
		int rows=pstatement.executeUpdate();
		System.out.println(rows+"Rows inserted");
		DbConnector.closeConnection();
	}
}
