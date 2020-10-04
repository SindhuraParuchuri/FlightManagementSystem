package com.cg.fms.controller;

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

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.User;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;

@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	IUserService service = new UserService();
	int isCreated = 0;
    PrintWriter out = response.getWriter();
	RequestDispatcher dispatcher = null;
	boolean isUserExists = false;
	
	String userName = request.getParameter("uname");
	String password = request.getParameter("upass");
	Long mobileNumber = Long.parseLong(request.getParameter("umobile"));
	String emailId = request.getParameter("uemail");
	
	try {
		User user = new User(userName, password, mobileNumber, emailId);
		//isUserExists = service.isUserExists(userName);
		//if(isUserExists) {
			//System.out.println("user already exists");
		//} else {
			isCreated = service.accountCreation(user);
			if (isCreated > 0) {
				out.println("Account Created Successfully!!");
				dispatcher = request.getRequestDispatcher("userPage.jsp");
				dispatcher.forward(request, response);
			} else {
				System.out.println("Problem occured while inserting");
			}
		//}
		
	} catch (FMSException e) {
		System.out.println(e.getMessage());
	}

	
}
}
