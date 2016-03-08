package com.two95.college;

import java.util.List;

public class Courses {
	private String courseName;
	private List<Trainer>trainer;
	private List<Student>student;
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	
	public List<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(List<Trainer> trainer) {
		this.trainer = trainer;
	}
	
	public Courses(String courseName, List<Trainer> trainer, List<Student> student) {
		super();
		this.courseName = courseName;
		this.trainer = trainer;
		this.student = student;
	}
	public Courses() {
		
	}
	@Override
	public String toString() {
		return "courseName = " + courseName + ", trainers are:" + trainer + ", students enrolled are: " + student;
	}
	
	

}
