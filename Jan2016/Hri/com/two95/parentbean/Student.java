package com.two95.parentbean;

import java.util.List;

public class Student {

	List<String>student;

	public Student(){
		
	}
	public Student(List<String> student) {
		//super();
		this.student = student;
	}

	public List<String> getStudent() {
		return student;
	}

	public void setStudent(List<String> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Student [student=" + student + "]";
	}
	
}
