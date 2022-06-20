package com.hotel.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GuestLogin")
public class GuestLogin extends HttpServlet{

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
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			String email=request.getParameter("email");
			String name=request.getParameter("name");
		try {	
			ps=connect.prepareStatement("select * from guest where email=? and name=?");
			ps.setString(1,email);
			ps.setString(2,name);
			
			ResultSet rs1=ps.executeQuery();
			PrintWriter pw1 = response.getWriter();
			if(rs1.next()) {
				response.sendRedirect("./guestHome.html");
			
			}
			else {
				response.sendRedirect("./guestLogin");
			}
		}catch (SQLException | NumberFormatException e ) {
			// TODO Auto-generated catche block
			e.printStackTrace();
		}

		}
}
