package com.cg.fms.dao;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.User;

public interface IUserDAO {

	public boolean isUserExists(String userName) throws FMSException;
	
	public int accountCreation(User user) throws FMSException;

	public int userLogin(String emailId, String password) throws FMSException;

}

