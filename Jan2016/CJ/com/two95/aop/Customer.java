package com.two95.aop;

public class Customer {
	private String custName;
	private String username;
	private String password;
	private String address;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customer(String custName, String username, String password, String address) {
		super();
		this.custName = custName;
		this.username = username;
		this.password = password;
		this.address = address;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", address="
				+ address + "]";
	}
	

}
