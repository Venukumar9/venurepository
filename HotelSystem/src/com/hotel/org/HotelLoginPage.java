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
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;
@WebServlet("/HotelLoginPage")
public class HotelLoginPage extends HttpServlet{

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
		
			String hotelemail=request.getParameter("hotelemail");
			String hotelname=request.getParameter("hotelname");
			HttpSession hs =request.getSession();
			try {

			
			ps=connect.prepareStatement("select * from hotelmanagement where hotelemail=? and hotelname=?");
		ps.setString(1,  hotelemail);
		ps.setString(2,hotelname);
		
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()) {
			
		    hs.setAttribute("hotelId", rs.getInt(1));
		    hs.setAttribute("hotelemail", rs.getString("hotelemail"));
		    hs.setAttribute("hotelname", rs.getString("hotelname"));
		    response.sendRedirect("./hotelmanagementhome.html");
			
		}
		else {
			response.sendRedirect("./hotel.html");
		}
			}catch (SQLException | NumberFormatException e ) {
			// TODO Auto-generated catche block
			e.printStackTrace();
		}
			
			}
}
			
		

