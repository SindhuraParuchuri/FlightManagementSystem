package com.cg.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.BeanClass.Customers;
import com.cg.JdbcUtility.JdbcUtility;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String emailId = request.getParameter("uemail");
	String password = request.getParameter("upass");
	PrintWriter out = response.getWriter();
	RequestDispatcher dis =null;
	//Customers c = new Customers(emailId,password);
	try {
		
		Connection con = JdbcUtility.connect();
		String userdetails = "select emailid,password from details where emailid='"
                        + emailId
                        + "' AND password='"
                        + password
                        + "'";;
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(userdetails);
		//boolean value = rs.next();
		if(rs.next() == false ) {
			out.println("sorry please register");
			response.setContentType("text/html");
			 dis = request.getRequestDispatcher("Register.jsp");
			dis.include(request, response);
			
		} else {
			out.println("Logged in successfully");
			if(emailId.equals("admin@gmail.com") & password.equals("admin")) {
			dis = request.getRequestDispatcher("adminPage.jsp");
			dis.forward(request,response);
			} else {
				dis = request.getRequestDispatcher("userPage.jsp");
				dis.forward(request,response);
			}
					}
		
	}catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
