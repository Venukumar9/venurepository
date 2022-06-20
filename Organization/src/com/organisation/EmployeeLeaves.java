package com.organisation;

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
@WebServlet("/EmployeeLeaves")
public class EmployeeLeaves  extends HttpServlet{

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
				
				int totalleaves=Integer.parseInt(request.getParameter("totalLeaves"));
				int leavesperMonth=Integer.parseInt(request.getParameter("leavesperMonth"));
				int pending=Integer.parseInt(request.getParameter("pendingLeaves"));
				int usedleaves=Integer.parseInt(request.getParameter("leaveUsedInMonth"));
				String status= request.getParameter("status");
		
				
		
				ps=connect.prepareStatement("insert into leaves(totalLeaves,leavesperMonth,pendingleaves,leaveUsedInMonth,status) values(?,?,?,?,?)");
	            
				ps.setInt(1, totalleaves);
				ps.setInt(2, leavesperMonth );
				ps.setInt(3, pending);
				ps.setInt(4, usedleaves);
				ps.setString(5, status);
				
			int x=	ps.executeUpdate();
			PrintWriter pw=response.getWriter();
			if(x!=0) {
				
				response.sendRedirect("./managerhome.html");
			}
			else {
			   response.sendRedirect("./EmployeeNoOfLeaves.html");
			}
			}catch(SQLException | NumberFormatException e) {
				e.printStackTrace();
				
			}
			}
	}

