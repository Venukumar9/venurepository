package com.motivity7;

import java.sql.DriverManager;
import java.sql.SQLException;



public class JdbcConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url ="jdbc:mysql://localhost:3306/motivity";
		String username="root";
		String password="root";
		java.sql.Connection connection =   DriverManager.getConnection(url, username, password);
		if(connection!=null) {
			System.out.println("established");
		}

	}

}
