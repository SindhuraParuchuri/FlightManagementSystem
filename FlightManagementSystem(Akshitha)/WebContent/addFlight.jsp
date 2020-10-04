<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.cg.fms.dao.AdminDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action = "AddFlightController" method="post">
Flight Model:<input type = "text" name = "flightmodel"><br>
Carrier Name: <input type = "text" name = "carriername"><br>
Seat Capacity:<input type = "text" name = "seatcapacity"><br>

<input type ="submit" value ="submit">

</form>





</body>
</html>