
 package com.organisation;

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

@WebServlet("/ManagerApprovel")
public class ManagerApprovel extends HttpServlet{

	Connection connect =null;
	 PreparedStatement ps=null;
		public void init(ServletConfig config) {
			try {
				connect=DbConnection.getconnect();
			} catch (ClassNotFoundException | SQLException e) {
			
				e.printStackTrace();
			}
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			try {
				
				String mname=request.getParameter("Mname");
				
				
		
				ps=connect.prepareStatement("select * from manager where Mname=?");
	            
			
				ps.setString(1, mname);
				
				ResultSet rs=ps.executeQuery();
				PrintWriter pw=response.getWriter();
				if(rs.next()) {
					pw.println("leave Accepted");
				}
				else {
				   response.sendRedirect("you already used all the leaves ..");
				}
				}catch(SQLException | NumberFormatException e) {
					e.printStackTrace();
					
				}
				}
		

		}


