package com.two95.college;

import java.util.Iterator;
import java.util.List;

import com.two95.emp.Team;

public class College {
	private String collegeName;
	private List<Courses>course;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<Courses> getCourse() {
		return course;
	}
	public void setCourse(List<Courses> course) {
		this.course = course;
	}
	public College(String collegeName, List<Courses> course) {
		super();
		this.collegeName = collegeName;
		this.course = course;
	}
	public College() {
	
	}
	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", course=" + course + "]";
	}
	public void display()
	{
		 Iterator<Courses> itr=course.iterator();  
		    while(itr.hasNext()){  
		    	 System.out.println(itr.next());   
		    } 
	}

}
