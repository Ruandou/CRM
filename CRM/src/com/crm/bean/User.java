package com.crm.bean;

public class User {
	private int id;
	private String userId;
	private String userName;
	private String password;
	
	public User() {}
	
	public User(String userId, String password) {
		this.userId = userId;
		this.password = password;
	}
	
	public User(int id, String userId, String userName, String password) {
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
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
}
