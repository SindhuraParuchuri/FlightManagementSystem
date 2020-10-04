package com.cg.fms.model;

import java.sql.Date;

public class Booking {

	private Integer bookingId;
	private Integer userId;
	private Date bookingDate;
	private Double cost;
	private Integer passengerCount;
	private String bookingState;
	private Integer flightNumber;
	
	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Date getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Integer getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}
	public String getBookingState() {
		return bookingState;
	}
	public void setBookingState(String bookingState) {
		this.bookingState = bookingState;
	}
	public Integer getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(Integer flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	public Booking(Integer bookingId, Integer userId, Date bookingDate, Double cost, Integer passengerCount,
			String bookingState, Integer flightNumber) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.cost = cost;
		this.passengerCount = passengerCount;
		this.bookingState = bookingState;
		this.flightNumber = flightNumber;
	}
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Booking(Date bookingDate, Double cost, Integer passengerCount, String bookingState) {
		super();
		this.bookingDate = bookingDate;
		this.cost = cost;
		this.passengerCount = passengerCount;
		this.bookingState = bookingState;
	}
	
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", userId=" + userId + ", bookingDate=" + bookingDate + ", cost="
				+ cost + ", passengerCount=" + passengerCount + ", bookingState=" + bookingState + ", flightNumber="
				+ flightNumber + "]";
	}
	
	
}
