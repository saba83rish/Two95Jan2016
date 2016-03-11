package com.java.config;

import java.util.List;

public class Employee {
	private String name;
	private String empId;
	private List<String> team;

	public Employee() {

	}

	public Employee(String name, String empId, List<String> team) {
		super();
		this.name = name;
		this.empId = empId;
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public List<String> getTeam() {
		return team;
	}

	public void setTeam(List<String> team) {
		this.team = team;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", team=" + team + "]";
	}

}
