package com.two95.nish.homeworks.two95employees;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class Two95EmployeesTest {
	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beanTwo95Employees.xml"));
		Two95Employees e = (Two95Employees) factory.getBean("two95employees");
	     e.displayInfo();
	     
	  //This is 1 c, printing only the MarketingTeam name for the Meeting of marketing people   
	     List<MarketingEmployees> memp = e.getMarketingEmp();
	     List<RecruitmentEmployees> remp = e.getRecruitmentEmp();
	     List<String> newList = new ArrayList<String>();
		 List<String> marketingTeam = new ArrayList<String>();
		 List<String> newList2 = new ArrayList<String>();
		 List<String> recruitmentTeam = new ArrayList<String>();
		   
	    for(MarketingEmployees emp : memp){
	        marketingTeam.add(emp.getEmpName());
	        newList.add(emp.getEmpName());
	        System.out.println("MarketingTeam:     "+emp.getEmpName());
	    }
	    for(RecruitmentEmployees emp2:remp){
	    	recruitmentTeam.add(emp2.getEmpName());
	    	newList2.add(emp2.getEmpName());
	    }
	    String a[]= newList.toArray(new String[0]);
	    String min=a[0];
	    for(int i=0;i<a.length;i++){
	    	if(min.length()>a[i].length()){
	    		min=a[i];}}
	    System.out.println(min);
	}
}
