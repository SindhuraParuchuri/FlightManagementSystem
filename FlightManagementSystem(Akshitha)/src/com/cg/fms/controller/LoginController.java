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
import com.cg.fms.model.*;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;
import com.cg.fms.service.IUserService;
import com.cg.fms.service.UserService;
import com.cg.fms.utility.*;;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	IUserService service = new UserService();
	int isLogged =0;
	RequestDispatcher dispatcher = null;
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException {
	String emailId = request.getParameter("uemail");
	String password = request.getParameter("upass");
	PrintWriter out = response.getWriter();
	RequestDispatcher dis =null;
	//Customers c = new Customers(emailId,password);
	
	try {
		
		User user = new User(emailId,password);
		isLogged = service.userLogin(emailId,password);
		System.out.println(isLogged);
		if(isLogged ==0) {
			if(emailId.equals("admin@gmail.com") && password.equals("admin")) {
				dispatcher = request.getRequestDispatcher("adminPage.jsp");
				dispatcher.forward(request, response);
			} else {
				out.println("user doesnot exists please register");
				dispatcher = request.getRequestDispatcher("Register.jsp");
				dispatcher.forward(request, response);
			}
		}else {
			out.println("Account Created Successfully!!");
			dispatcher = request.getRequestDispatcher("userPage.jsp");
			dispatcher.forward(request, response);
			}
			
			
		}	
	
	
	catch (FMSException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	
	
	catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
