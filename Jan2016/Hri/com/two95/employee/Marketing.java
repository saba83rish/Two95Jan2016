package com.two95.employee;

import java.util.Iterator;

public class Marketing {
	String name;
	String email;
	String designation;
	String team;
	public Marketing(String name, String email, String designation, String team) {
		
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.team = team;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public Marketing() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Marketing [name=" + name + ", email=" + email + ", designation=" + designation + ", team=" + team + "]";
	}
	
	
	
}
