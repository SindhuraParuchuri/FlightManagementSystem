<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.cg.admin.AdminMethods,java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String flightNumber = request.getParameter("flightno");
ResultSet rs = AdminMethods.searchFlight(flightNumber);
while(rs.next()) { %>
	Flight Number:<%=rs.getString(1) %><br>
	Available Seats:<%= rs.getString(2) %><br>
	cost<%=rs.getString(3)%><br>
	sourceairport<%=rs.getString(4)%><br>
	 destinationairport<%=rs.getString(5)%><br>
	departuredatetime<%=rs.getString(6)%><br>
	arrivaldatetime<%=rs.getString(7)%><br>
	scheduleflightstatus<%=rs.getString(8)%><br>
	
<% } %>
</body>
</html>