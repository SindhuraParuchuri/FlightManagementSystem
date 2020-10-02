<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.cg.admin.AdminMethods" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="timings.jsp">
Flight Number :<input type = "text" name = "flightno"><br>
		Departure Date Time <input type ="text" name ="ddt"><br>
Arrival Date Time <input type = "text" name="adt"><br>
<input type ="submit" value ="update">
</form>
<%
String flightNumber = request.getParameter("flightno");
System.out.println(flightNumber);
String departuredt = request.getParameter("ddt");
System.out.println(departuredt);
String arrivaldt= request.getParameter("adt");
System.out.println(arrivaldt);
	AdminMethods.modifyTimings(flightNumber,departuredt,arrivaldt);
  %>
</body>
</html>