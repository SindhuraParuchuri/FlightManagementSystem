<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UserController" method = "post">
<input type = "submit" value = "Check for available flights" name = "checkAvailableFlights">
<input type = "submit" value = "Make Booking" name = "bookFlight">
<input type = "submit" value = "View Bookings made" name = "viewBookings">
<input type = "submit" value = "Cancel Booking" name = "cancelBooking">
<input type = "submit" value = "Modify Booking" name = "modifyBooking">


</form>
</body>
</html>