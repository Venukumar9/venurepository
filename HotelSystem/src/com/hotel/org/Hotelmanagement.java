package com.hotel.org;

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


@WebServlet("/Hotelmanagement")
public class Hotelmanagement extends HttpServlet{
	
		 Connection connect =null;
		 PreparedStatement ps=null;
			public void init(ServletConfig config) {
				try {
					connect=DbConnection.getconnect();
				} catch (ClassNotFoundException | SQLException e) {
				
					e.printStackTrace();
				}
			}
			@Override
			protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
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
				int x=	ps.executeUpdate();
					if(x!=0) {
						response.sendRedirect("./hotel.html");
					}
					else
					{
						response.sendRedirect("./hotelmanagement");
					}
					
					} catch (SQLException | NumberFormatException e ) {
						// TODO Auto-generated catche block
						e.printStackTrace();
					}
			}
}
