package com.organisation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;
@WebServlet("/ManagerAprove")
public class ManagerAprove extends HttpServlet{

	

	

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
				
				String from=request.getParameter("fromdate");
				String to=request.getParameter("todate");
				
				// Convert From To Into Date

				LocalDate f = LocalDate.parse(from, DateTimeFormatter.ISO_DATE);

				LocalDate t = LocalDate.parse(to, DateTimeFormatter.ISO_DATE);
				
				
				ps=connect.prepareStatement("select * from empleaves where fromdate=? and todate=?");
	            
				
				
				ps.setString(4, from);
				ps.setString(5, to);
			
				
			ResultSet rs=	ps.executeQuery();
			PrintWriter pw=response.getWriter();
			if(rs.next()) {
				pw.println("sucessfull");
				//response.sendRedirect("./managerhome.html");
			}
			else {
				pw.println("unsuccesful");
			   //response.sendRedirect("./EmployeeNoOfLeaves.html");
			}
			}catch(SQLException | NumberFormatException e) {
				e.printStackTrace();
				
			}
			}
			
}
