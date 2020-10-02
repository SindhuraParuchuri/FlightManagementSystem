<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action ="RegisterController" method ="post">
UserID : <input type = "text" name = "uid"><br>
Type of user : <select name = "usertype">
               <option>User</option>
               <option>Admin</option>
</select><br>
User Name : <input type ="text" name ="uname"><br>
Password  : <input type ="password" name ="upass"><br>
Confirm password :<input type ="password" name ="confirmpass"><br>
Mobile Number : <input type ="text" name ="umobile"><br>
Email Id : <input type = "email" name ="uemail"><br>
Country : <select name = "ucountry">
        <option>India</option>
        <option>US</option>
        <option>Australia</option>
</select><br>
<input type = "submit" value ="Sign Up">
</form>
</body>
</html>