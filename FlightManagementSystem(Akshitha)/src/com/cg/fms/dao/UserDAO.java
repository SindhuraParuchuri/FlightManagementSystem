package com.cg.fms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.fms.exceptions.FMSException;
import com.cg.fms.model.User;
import com.cg.fms.utility.JdbcUtility;

public class UserDAO implements IUserDAO{

	static Connection connection = null;
	static PreparedStatement prepareStatement = null;
	static ResultSet resultSet = null;
	
	@Override
	public boolean isUserExists(String userName) throws FMSException{
		// TODO Auto-generated method stub
		boolean found = false;
		try {
			connection = JdbcUtility.getConnection();
			prepareStatement = connection.prepareStatement(CustomerQueryConstants.USER_EXISTS,Statement.RETURN_GENERATED_KEYS );
			prepareStatement.setString(1, userName);
			//resultSet = prepareStatement.executeQuery();
			prepareStatement.addBatch();
			prepareStatement.executeBatch();
			if(resultSet.next()) {
				found = true;
			}
		} catch (SQLException e) {
			throw new FMSException("problem while creating PS object");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new FMSException("problem while creating PS object");
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new FMSException("problem while closing");
			}

		}
        return found;
	}

	@Override
	public int accountCreation(User user) throws FMSException {
		// TODO Auto-generated method stub
		int isInserted = 0;
		try {
		  connection = JdbcUtility.getConnection();
		  prepareStatement = connection.prepareStatement(CustomerQueryConstants.REGISTER_USER, Statement.RETURN_GENERATED_KEYS );
		  prepareStatement.setString(1,user.getUserName());
		  prepareStatement.setString(2,user.getPassword() );
		  prepareStatement.setLong(3,user.getMobileNumber() );
		  prepareStatement.setString(4,user.getEmailId() );
		  prepareStatement.addBatch();
		  prepareStatement.executeBatch();
		  resultSet = prepareStatement.getGeneratedKeys();
		while(resultSet.next()) {
			isInserted = resultSet.getInt(1);
		}
		  System.out.println("inserted successfully");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isInserted;

	}
	
	public int userLogin(String emailId,String password) throws FMSException {
		int rows =0;
		
		try {
			
			 connection = JdbcUtility.getConnection();
			 prepareStatement = connection.prepareStatement(CustomerQueryConstants.USER_LOGIN);
			 prepareStatement.setString(1, emailId);
			 prepareStatement.setString(2, password);
			resultSet = prepareStatement.executeQuery();
			
		if(resultSet.next()) {
			rows =1;
			
		}
	}
		
		catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return rows;
}
	
	

	
}
