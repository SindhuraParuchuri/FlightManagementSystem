<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.admin.AdminMethods" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "addFlight.jsp">
Flight Number:<input type = "text" name = "flightno"><br>
Flight Model:<input type = "text" name = "flightmodel"><br>
Carrier Name: <input type = "text" name = "carriername"><br>
Seat Capacity:<input type = "text" name = "seatcapacity"><br>
Ticket Cost:<input type = "text" name = "ticketcost"><br>
<input type ="submit" value ="submit">

</form>

<%String flightNumber = request.getParameter("flightno");
String flightModel = request.getParameter("flightmodel");
String carrierName = request.getParameter("carriername");
String seatCapacity = request.getParameter("seatcapacity");
String cost = request.getParameter("ticketcost");
if(flightNumber == null & flightModel == null & carrierName == null & seatCapacity == null & cost == null) {
	
} else if (flightNumber.length() == 0 &  flightModel.length() == 0 &  carrierName.length()==0 & seatCapacity.length()==0 & cost.length() == 0 ) {
	
%><% } else {%>

	<% AdminMethods.addFlights(flightNumber,flightModel,carrierName,seatCapacity,cost); %>
	inserted successfully

<% }%>



</body>
</html>