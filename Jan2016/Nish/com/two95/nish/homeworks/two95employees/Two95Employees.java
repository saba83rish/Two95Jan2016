package com.two95.nish.homeworks.two95employees;


import java.util.List;

public class Two95Employees {
	
	private List<RecruitmentEmployees> recruitmentEmp;
	private List<MarketingEmployees> marketingEmp;


	public Two95Employees(List<RecruitmentEmployees> recruitmentEmp, List<MarketingEmployees> marketingEmp) {
		this.recruitmentEmp = recruitmentEmp;
		this.marketingEmp = marketingEmp;
	}
   
	public List<RecruitmentEmployees> getRecruitmentEmp() {
		return recruitmentEmp;
	}

	public void setRecruitmentEmp(List<RecruitmentEmployees> recruitmentEmp) {
		this.recruitmentEmp = recruitmentEmp;
	}

	public List<MarketingEmployees> getMarketingEmp() {
		return marketingEmp;
	}

	public void setMarketingEmp(List<MarketingEmployees> marketingEmp) {
		this.marketingEmp = marketingEmp;
	}

	@Override
	public String toString() {
		return "Team [recruitmentEmp=" + recruitmentEmp + ", marketingEmp=" + marketingEmp + "]";
	}
	public void displayInfo(){
		System.out.println(recruitmentEmp+" "+marketingEmp+" ");
	}
}
