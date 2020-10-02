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
<form action="location.jsp">
Flight Number :<input type = "text" name = "flightno"><br>
	Source Airport:<select name="srcairport">
           <option>RGI Airport</option>
           <option>Chatrapathi Shivaji</option>
           <option>Delhi Airport</option>
           <option>Pune Airport</option>

</select><br>
Destination Airport:<select name="dstairport">
           <option>Los Angeles</option>
           <option>Dallas International</option>
           <option>Dubai International </option>
           <option>San Fransisco </option>

</select><br>
<input type ="submit" value ="update">
</form>
<%
String flightNumber = request.getParameter("flightno");
System.out.println(flightNumber);
String sourceAirport = request.getParameter("srcairport");
String destinationAirport= request.getParameter("dstairport");
	AdminMethods.modifyLocation(flightNumber,sourceAirport,destinationAirport);

%>
</body>
</html>