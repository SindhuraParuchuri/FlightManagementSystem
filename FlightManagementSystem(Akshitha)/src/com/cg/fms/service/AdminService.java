package com.cg.fms.service;

import java.sql.SQLException;
import java.util.List;

import com.cg.fms.dao.AdminDAO;
import com.cg.fms.dao.IAdminDAO;
import com.cg.fms.dao.IUserDAO;
import com.cg.fms.dao.UserDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.Flight;

public class AdminService implements IAdminService{

	IAdminDAO adminDao = new AdminDAO();
	@Override
	public int addFlights(String flightModel, String carrierName, int seatCapacity) throws FMSException {
		// TODO Auto-generated method stub
		
		return adminDao.addFlights(flightModel, carrierName, seatCapacity);
		
	}
	@Override
	public List<Flight> viewFlights() throws FMSException {
		// TODO Auto-generated method stub
		return adminDao.viewFlights();
	}
	
	

}
