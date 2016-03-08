package com.two95.emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.xml.ws.Response;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Test 
	{
		static Comparator<String> comp = null;
		public static void main(String[] args) 
		{
			Resource resource=new ClassPathResource("beanEmp.xml");  
			BeanFactory factory=new XmlBeanFactory(resource);
			Two95 two95=(Two95) factory.getBean("team");
			two95.display();
	        List<Team> team = two95.getTeam();
	        Team marketing = team.get(1);
	        Team recruitment = team.get(0);
	        List<String> newList = new ArrayList<String>();
	        List<String> marketingTeam = new ArrayList<String>();
	        List<Employee> memp = marketing.getEmp();
	        List<Employee> recr=recruitment.getEmp();
	   
	    for(Employee emp:memp)
	    	{
	    		marketingTeam.add(emp.getEmpName());
	    		newList.add(emp.getEmpName());
	    		System.out.println("Meeting called for you Mr"+emp.getEmpName());
	    	 }
	    for(Employee emp:recr)
	    	{
	    	 	newList.add(emp.getEmpName());
	    	}
	    //System.out.println(newList);
	    String[] smallName = newList.toArray(new String[0]);
	    String first = smallName[0];
	        for (int i=1; i<smallName.length;i++)
	        {
	          if((smallName[i].length()<first.length()))
	          {
	               first = smallName[i];  
	               System.out.println("Smallest name in employee_name_list of two95 is "+first);
	          }
	        }
	        System.out.println("Employees in Marketing team who got meeting invitation are "+marketingTeam);
	        
		}
	}


