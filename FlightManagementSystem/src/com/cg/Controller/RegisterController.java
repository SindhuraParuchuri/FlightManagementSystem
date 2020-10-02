package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.JdbcUtility.JdbcUtility;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String userId = request.getParameter("uid");
	String userType = request.getParameter("usertype");
	String userName = request.getParameter("uname");
	String password = request.getParameter("upass");
	String confirmPassword = request.getParameter("confirmpass");
	String mobileNumber =request.getParameter("umobile");
	String emailId = request.getParameter("uemail");
	String country = request.getParameter("ucountry");
	PrintWriter out = response.getWriter();
	
	try {
		Connection con = JdbcUtility.connect();
		System.out.println("Connection established");
	    PreparedStatement ps = null;
      String query = "insert into details values(?,?,?,?,?,?,?,?);";
      ps = con.prepareStatement(query);
      int rows = 0;
      
      ps.setString(1,userId);
      ps.setString(2,userType);
      ps.setString(3,userName);
      ps.setString(4, password);
      ps.setString(5, confirmPassword);
      ps.setString(6, mobileNumber);
      ps.setString(7, emailId);
      ps.setString(8, country);
      rows = ps.executeUpdate();
      
      System.out.println("inserted successfully");
      out.println("inserted successfully");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
	
}
}
