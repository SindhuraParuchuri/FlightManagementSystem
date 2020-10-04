<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.*,java.util.*,com.cg.fms.dao.AdminDAO" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="viewScheduleFlight.jsp" method = "post">
Ticket Cost:<input type = "text" name = "cost"><br>
Source Airport:<select name="srcairport">
               <option>RGI Airport</option>
               <option>Chatrapathi Shivaji Airport(Mumbai)</option>
               <option>Delhi Airport</option>
               <option>Pune Airport</option>

</select><br>
Destination Airport:<select name="dstairport">
               <option>Los Angeles Airport</option>
               <option>Dallas International Airport</option>
               <option>Dubai International Airport</option>
               <option>San Fransisco Internation Airport</option>

</select><br>
Departure Date Time <input type ="Date" name ="ddt"><br>
Arrival Date Time <input type = "Date" name="adt"><br>
Schedule Flight status<input type = "text" name ="flightstatus"><br>
<input type ="submit" value = "submit"> 
</form>
<%



%>
</body>
</html>