package com.cg.fms.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScheduleFlightController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	
	String ticketCost = request.getParameter("cost");
	String sourceAirport = request.getParameter("srcairport");
	String destinationAirport = request.getParameter("dstairport");
	String departuredt = request.getParameter("ddt");
	String arrivaldt= request.getParameter("adt");
	String flightStatus = request.getParameter("flightstatus");

	int rows = 0;
	//rows = AdminDAO.viewScheduleFlights(ticketCost,sourceAirport,destinationAirport,departuredt,arrivaldt,flightStatus);

}
}
