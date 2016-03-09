package com.java.collections;

public class Employees {
	
	private String empName;
	private String empID;
	
	
	public Employees(String empName, String empID) {
		super();
		this.empName = empName;
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	
	@Override
	public String toString() {
		return "Employees [empName=" + empName + ", empID=" + empID + "]";
	}

}
