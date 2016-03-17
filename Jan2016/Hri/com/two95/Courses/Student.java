package com.two95.Courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable {

	String name;
	String id;
	String coursename;
	
	public Student(String name, String id, String coursename) {
		super();
		this.name = name;
		this.id = id;
		this.coursename = coursename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	

	public void setId(String id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Student s=(Student)arg0;
		return this.name.compareTo(s.name);
	}
	
	@Override
	public String toString() {
		//List<Student> s=ui.getStudents()
		
		return "Student [name=" + name + ", id=" + id + ", coursename=" + coursename + "]";
	}

	
	
}
