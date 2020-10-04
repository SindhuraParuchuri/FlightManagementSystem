package com.cg.fms.model;

public class User {
	private Integer userId;
	private String userName;
	private String password;
	private Long mobileNumber;
	private String emailId;

	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public Long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public User(Integer userId, String userName, String password, Long mobileNumber, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	public User(String userName, String password,  Long mobileNumber, String emailId) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		
	}
	public User(String emailId, String password) {
		super();
		this.password = password;
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "Customers [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobileNumber="
				+ mobileNumber + ", emailId=" + emailId + "]";
	}
	
}
