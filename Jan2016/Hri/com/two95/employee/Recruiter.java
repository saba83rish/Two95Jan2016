package com.two95.employee;

import java.util.List;

public class Recruiter {
	
	String name;
	String email;
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
	String designation;
	String team;
	public Recruiter(){
		
	}
	
	
	
	public Recruiter(String name, String email, String designation, String team) {
		
		this.name = name;
		this.email = email;
		this.designation = designation;
		this.team = team;
	}
	@Override
	public String toString() {
		return "Recruiter [name=" + name + ", email=" + email + ", designation=" + designation + ", team=" + team + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
