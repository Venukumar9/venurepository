<%@page import="com.mysql.cj.xdevapi.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="lime">
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
<tr> <td>hotelId</td><td>hotelname</td><td>hotelemail</td><td>city</td><td>pincode</td></tr>

<%
Connection connect =DbConnection.getconnect();
int hotelId =(Integer)session.getAttribute("hotelId");
PreparedStatement ps=connect.prepareStatement("select * from hotelmanagement where hotelId=?");
ps.setInt(1, hotelId);
ResultSet rs =ps.executeQuery();
while(rs.next()){
%>
<tr><td><%=rs.getInt(1) %></td>  <td><%=rs.getString(2) %></td>  <td><%=rs.getString(3) %></td>
  <td><%=rs.getString(4) %></td>  <td><%=rs.getString(5) %></td></tr>
<%} %>




</table>
</body>
</html>