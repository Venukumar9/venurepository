package com.hotel.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GuestRegister")
public class GuestRegister extends HttpServlet{

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
			try {
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String address=request.getParameter("address");
			
			
				ps=connect.prepareStatement("insert into guest(name,email,address) values(?,?,?)");
			
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, address);
		int x=	ps.executeUpdate();
			
			if(x!=0) {
			response.sendRedirect("./guestLogin.html");
			}
			else {
				response.sendRedirect("./guestregister.html");
			}
			
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
}
