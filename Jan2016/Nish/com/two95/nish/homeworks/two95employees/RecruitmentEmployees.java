package com.two95.nish.homeworks.two95employees;


public class RecruitmentEmployees {
	private String empName;
	private String designation;
	private String email;
	private String teamName;

	public RecruitmentEmployees(String empName, String designation, String email, String teamName) {
		super();
		this.empName = empName;
		this.designation = designation;
		this.email = email;
		this.teamName = teamName;
	}
    
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "RecruitmentEmployees [empName=" + empName + ", designation=" + designation + ", email=" + email
				+ ", teamName=" + teamName + "]";
	}

}
