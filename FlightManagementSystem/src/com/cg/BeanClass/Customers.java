package com.cg.BeanClass;

public class Customers {
public String userName;
public String password;
public String confirmPassword;
public String mobileNumber;
public String emailId;
public String Country;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmPassword() {
	return confirmPassword;
}
public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public Customers(String userName, String password, String confirmPassword, String mobileNumber, String emailId,
		String country) {
	super();
	this.userName = userName;
	this.password = password;
	this.confirmPassword = confirmPassword;
	this.mobileNumber = mobileNumber;
	this.emailId = emailId;
	Country = country;
}
public Customers(String password, String emailId) {
	super();
	this.password = password;
	this.emailId = emailId;
}

}
