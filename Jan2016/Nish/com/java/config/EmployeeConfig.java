package com.java.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean(name = "emp1")
	public Employee emp1() {
		Employee e = new Employee();
		e.setEmpId("101");
		e.setName("John");
		e.setTeam(getList());
		return e;
	}
	@Bean(name = "emp2")
	public Employee emp2() {
		Employee e = new Employee();
		e.setEmpId("102");
		e.setName("Nicole");
		e.setTeam(getList());
		return e;
	}
	@Bean(name = "emp3")
	public Employee emp3() {
		Employee e = new Employee();
		e.setEmpId("103");
		e.setName("Rina");
		e.setTeam(getList());
		return e;
	}
	

	private List<String> getList() {
		// TODO Auto-generated method stub
		
		List<String> team = new ArrayList<String>();
		team.add("MarketingTeam");
		return team;
	}
}
