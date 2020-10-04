package com.cg.fms.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		RequestDispatcher dis = null;
		
		if(request.getParameter("addFlight") != null) {
			dis = request.getRequestDispatcher("addFlight.jsp");
			dis.include(request, response);
		} else if(request.getParameter("viewScheduledFlight") != null) {
			dis = request.getRequestDispatcher("viewScheduleFlight.jsp");
			dis.include(request, response);
		} else if(request.getParameter("viewFlights") != null) {
			dis = request.getRequestDispatcher("ViewFlightsController");
			dis.include(request, response);
		} else if(request.getParameter("scheduleFlight") != null) {
			dis = request.getRequestDispatcher("scheduleFlight.jsp");
			dis.include(request, response);
		} else{
			dis = request.getRequestDispatcher("searchFlight.jsp");
			dis.include(request, response);
		}
}
}
