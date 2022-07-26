<%@page import="java.sql.*"%>
<%@page import="com.hotel.org.DbConnection"%>
<%
Connection connect =DbConnection.getconnect();
String name= request.getParameter("hotelname");
int mobile= Integer.parseInt(request.getParameter("mobile"));
String dob=request.getParameter("dob");
String tob=request.getParameter("tob");
int gid=(Integer)session.getAttribute("gid");
String sql="insert into bookings(guestname,mobile,dob,tob,gid,hotelname,status) values (?,?,?,?,?,?,?)";
PreparedStatement ps=connect.prepareStatement(sql);
ps.setString(1, name);
ps.setInt(2,mobile);
ps.setString(3,dob);
ps.setString(4,tob);
ps.setInt(5,gid);
ps.setString(6,"none");
ps.setString(7,"pending");
int x=ps.executeUpdate();
if(x!=0){
	response.sendRedirect("./guestBooking.jsp");
	
}


%>