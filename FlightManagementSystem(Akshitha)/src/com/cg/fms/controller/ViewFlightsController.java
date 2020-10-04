package com.cg.fms.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import com.cg.fms.service.AdminService;
import com.cg.fms.service.IAdminService;
import java.util.*;

@WebServlet("/ViewFlightsController")
public class ViewFlightsController extends HttpServlet{
	IAdminService service = new AdminService();
	RequestDispatcher dispatcher=null;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
	
		try {
			List<Flight> flights =  service.viewFlights();
			if(flights.size() > 0) {
				request.setAttribute("flights",flights);
				dispatcher = request.getRequestDispatcher("viewFlights.jsp");
			dispatcher.forward(request,response);
			} else {
				out.println("sorry flights are not added yet");
				dispatcher = request.getRequestDispatcher("adminPage.jsp");
				dispatcher.forward(request,response);
				
			}
		} catch (FMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
