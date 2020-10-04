<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.fms.dao.AdminDAO,java.sql.*" %>
    <%@ taglib prefix ="c" uri ="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table >
<tr><th>FlightNumber</th><th>FlightModel</th><th>Carriername</th><th>SeatCapacity</th></tr>
<c:forEach items="${flights}" var="flight">
<tr><td><c:out value ="${flight.flightNumber}"/></td>
<td><c:out value ="${flight.flightModel}"/></td>
<td><c:out value ="${flight.carrierName}"/></td>
<td><c:out value ="${flight.seatCapacity}"/></td>

<td><a href="ScheduleFlightController?flightNumber ="${flight.flightNumber}">Schedule</a>
</td></tr>
</c:forEach>

</table>

</body>
</html>