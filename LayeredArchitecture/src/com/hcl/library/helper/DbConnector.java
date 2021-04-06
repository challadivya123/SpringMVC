package com.hcl.library.helper;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbConnector {
	//new istance of connection
	private static Connection connection=null;
	//opening connection with oracle databse
	public static Connection createConnection() throws ClassNotFoundException,SQLException{
		String url,userId,passWord;
		url="jdbc:mysql://@localhost:3306/library";
		userId="root";
		passWord="root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,userId,passWord);
		System.out.println(connection.isClosed());
		return connection;
	}
//closing connection
	public static void closeConnection() throws SQLException{
		connection.close();
	}
		// TODO Auto-generated method stub

	}

