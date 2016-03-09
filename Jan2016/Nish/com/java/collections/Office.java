package com.java.collections;

import java.util.List;
import java.util.Map;

public class Office {
	
	private String officeName;
	private List<Employees> emp;
	
	
	public Office(String officeName, List<Employees> emp) {
		super();
		this.officeName = officeName;
		this.emp = emp;
	}
	
	public String getOfficeName() {
		return officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	public List<Employees> getEmp() {
		return emp;
	}
	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}
	
	public void displayInfo(){
		System.out.println(officeName+" "+ emp+" ");
	}
	

}
