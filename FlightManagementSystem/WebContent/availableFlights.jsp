<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.admin.AdminMethods,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="availableFlights.jsp" >

</form>
<%
ResultSet rs = AdminMethods.availableFlights();
while(rs.next()) {%>
	Flight Number : <%= rs.getString(1) %><br>
	Flight Model  :<%= rs.getString(2) %><br>
	Carrier name  :<%= rs.getString(3) %><br>
	
<%}%>
</body>
</html>