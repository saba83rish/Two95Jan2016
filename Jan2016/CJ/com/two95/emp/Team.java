package com.two95.emp;

import java.util.List;

import com.two95.cards.Suites;

public class Team {
	private String dept;
	private List<Employee> emp;

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(String dept, List<Employee> emp) {
		super();
		this.dept = dept;
		this.emp = emp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "Team Two95 [dept=" + dept + ", emp=" + emp + "]";
	}

}
