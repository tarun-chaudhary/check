package com.discountAssessment2.model;

public class UserBean {
	
	private String uid;
	private String userType;
	private int customerSince;
	
	
	
	public UserBean(String uid, String userType,int customerSince) {
		super();
		this.uid = uid;
		this.userType = userType;
		this.customerSince = customerSince;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public int getUserSince() {
		return customerSince;
	}
	public void setUserSince(int userSince) {
		this.customerSince = userSince;
	}
	

	
	
}
