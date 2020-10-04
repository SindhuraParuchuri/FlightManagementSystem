package com.cg.fms.dao;

import java.sql.SQLException;
import java.util.List;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;
import com.cg.fms.model.User;

public interface IAdminDAO {

	public int addFlights(String flightModel, String carrierName, int seatCapacity) throws FMSException;

	public List<Flight> viewFlights() throws FMSException;
	
}
