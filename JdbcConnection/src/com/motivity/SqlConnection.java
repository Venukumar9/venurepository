package com.motivity;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class SqlConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	String url ="jdbc:mysql://localhost/3306/motivity";
	String username="root";
	String password="localhost";
	Connection connection = (Connection) DriverManager.getConnection(url, username, password);
	
	if(connection!=null) {
		System.out.println("establish");
	}
	
	}

}
