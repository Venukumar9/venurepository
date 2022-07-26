<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
<br><br><br>
<h1 align="center">welcome to guest homepage</h1>
<h2 align="center"><a href="guestHome.html">Home</a>
<a href="applyBooking.jsp">Apply for booking</a>
<a href="bookingdetails.jsp"> bookings Details</a>
<a href="index.html">logout</a>
</h2>

<br><br><br>
<h1 align="center">welcome to hotel home</h1>
<h2 align="center"><a href="hotelmanagementhome.html">Home</a>
<a href="hotel_profile.jsp">profile</a>
<a href="hotel_profile.jsp">hotel details</a>
<a href="index.html">logout</a>
</h2>
<br><br><br><br>
<%@page import="java.sql.*"%>
<%@page import="com.hotel.org.DbConnection"%>

<table border="2px solid acqa" width="400" height="200" cellpadding="20">
<tr> <td>Id</td><td>name</td><td>phone</td><td>date</td><td>time</td><td>hotelname</td><td>status</td></tr>

<%
Connection connect =DbConnection.getconnect();
int Id =(Integer)session.getAttribute("gid");
PreparedStatement ps=connect.prepareStatement("select * from bookings where pid=?");
ps.setInt(1, Id);
ResultSet rs =ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td>  <td><%=rs.getString(2) %></td>  <td><%=rs.getInt(3) %></td>
  <td><%=rs.getString(4) %></td>  <td><%=rs.getString(5) %></td>  <td><%=rs.getString(7) %></td>   <td><%=rs.getString(8) %></td></tr>
<%} %>




</table>
</body>
</html>

