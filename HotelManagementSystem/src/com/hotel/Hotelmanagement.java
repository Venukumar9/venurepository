package com.hotel;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hotelmanagement extends HttpServlet{
 Connection connect =null;
 PreparedStatement ps=null;
	public void init(ServletConfig config) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
			String url ="jdbc:mysql://localhost:3306/motivity";
			String user="root";
			String pass="root";
			try {
				connect=DriverManager.getConnection(url,user,pass);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
	}
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		try {
		String hotelname=request.getParameter("hotelname");
		String hotelemail=request.getParameter("hotelemail");
		String city=request.getParameter("city");
		int pincode=Integer.parseInt(request.getParameter("pincode"));		
 
		
	
			ps=connect.prepareStatement("insert into hotelmanagement(hotelname,hotelemail,city,pincode) values(?,?,?,?)");
		ps.setString(1, hotelname);
		ps.setString(2, hotelemail);
		ps.setString(3, city);
		ps.setInt(4, pincode);
		ps.executeUpdate();
		PrintWriter pw=response.getWriter();
		pw.println("hotel booked sucessfully..");
		
		} catch (SQLException | NumberFormatException e ) {
			// TODO Auto-generated catche block
			e.printStackTrace();
		}
	
	}
}

