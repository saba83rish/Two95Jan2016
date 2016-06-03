package com.java.inheritance;

public class Employee extends Person {
	
	private String empId;
	private String fname;
	private String lname;
	private String address;
	
	public Employee(){
		
	}

	public Employee(String empId, String fname, String lname, String address) {
		super();
		this.empId = empId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", address=" + address + "]";
	}
    

}
