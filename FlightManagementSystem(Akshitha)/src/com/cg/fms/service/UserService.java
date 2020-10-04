package com.cg.fms.service;

import com.cg.fms.dao.IUserDAO;
import com.cg.fms.dao.UserDAO;
import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.User;

public class UserService implements IUserService {

	IUserDAO userDao = new UserDAO();
	@Override
	public boolean isUserExists(String userName) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.isUserExists(userName);
	}
	
	@Override
	public int accountCreation(User user) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.accountCreation(user);
	}

	@Override
	public int userLogin(String emailId, String password) throws FMSException {
		// TODO Auto-generated method stub
		return userDao.userLogin(emailId,password);
	}

}
