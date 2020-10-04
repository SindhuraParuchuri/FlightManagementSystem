package com.cg.fms.dao;

public interface AdminQueryConstants {
	String ADD_FLIGHT = "insert into flight(flight_model,carrier_name,seat_capacity)values(?,?,?);";
	String ADMIN_LOGIN = "select emailid,password from user where emailid=? AND password=? ";
	String VIEW_FLIGHTS ="select * from flight";
}
