package com.cg.fms.dao;

public interface CustomerQueryConstants {

	String USER_EXISTS = "select * from user where username = ?";
	String REGISTER_USER = "insert into user(username,password,mobileno,emailid)values(?,?,?,?);";
	String USER_LOGIN = "select emailid,password from user where emailid=? AND password=? ";
}
