package com.cg.fms.model;

import java.sql.Date;

public class ScheduleFlight {

	private Integer flightNumber;
	private Integer availableSeats;
	private Double cost;
	private String sourceAirport;
	private String destinationAirport;
	private Date departureDate;
	private Date arrivalDate;
	private String flightStatus;
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	public Integer getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getSourceAirport() {
		return sourceAirport;
	}
	public void setSourceAirport(String sourceAirport) {
		this.sourceAirport = sourceAirport;
	}
	public String getDestinationAirport() {
		return destinationAirport;
	}
	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public Date getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	public String getFlightStatus() {
		return flightStatus;
	}
	public void setFlightStatus(String flightStatus) {
		this.flightStatus = flightStatus;
	}
	
	public ScheduleFlight(Integer flightNumber, Integer availableSeats, Double cost, String sourceAirport,
			String destinationAirport, Date departureDate, Date arrivalDate, String flightStatus) {
		super();
		this.flightNumber = flightNumber;
		this.availableSeats = availableSeats;
		this.cost = cost;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightStatus = flightStatus;
	}
	public ScheduleFlight() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduleFlight(Integer availableSeats, Double cost, String sourceAirport, String destinationAirport,
			Date departureDate, Date arrivalDate, String flightStatus) {
		super();
		this.availableSeats = availableSeats;
		this.cost = cost;
		this.sourceAirport = sourceAirport;
		this.destinationAirport = destinationAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.flightStatus = flightStatus;
	}
	
	@Override
	public String toString() {
		return "ScheduleFlight [flightNumber=" + flightNumber + ", availableSeats=" + availableSeats + ", cost=" + cost
				+ ", sourceAirport=" + sourceAirport + ", destinationAirport=" + destinationAirport + ", departureDate="
				+ departureDate + ", arrivalDate=" + arrivalDate + ", flightStatus=" + flightStatus + "]";
	}
	
	
	
	
}
