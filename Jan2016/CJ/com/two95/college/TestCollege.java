package com.two95.college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.two95.emp.Employee;
import com.two95.emp.Team;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beanCollege.xml");
		College college=(College) ctx.getBean("college");
		college.display();
	Courses s=(Courses) ctx.getBean("course1");
	Courses s1=(Courses) ctx.getBean("course2");
		List<Student> st=s.getStudent();
		List<Student> st1=s1.getStudent();
		List<String> newList = new ArrayList<String>();
		 for(Student str:st)
	    	{
			 
	    		
	    		newList.add(str.getStudentName());
	    		
	    	 }
		 for(Student str:st1)
	    	{
			 
	    		
	    		newList.add(str.getStudentName());
	    		
	    	 }
		 Collections.sort(newList);
		 System.out.println("Student names after sorting is "+newList);
		 
	}

}
