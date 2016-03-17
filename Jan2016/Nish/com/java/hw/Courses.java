package com.java.hw;

import java.util.List;

public class Courses {
	private String courseName;
	private String duration;
	private String fees;
	
	private List<Student> students;
	private List<Trainer> trainer;
	
	public Courses(String courseName, String duration, String fees, List<Student> students, List<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
		this.students = students;
		this.trainer = trainer;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getFees() {
		return fees;
	}
	public void setFees(String fees) {
		this.fees = fees;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(List<Trainer> trainer) {
		this.trainer = trainer;
	}
   public void displayInfo(){
	   System.out.println(courseName+"  \n"+trainer+"   ");
   }
}
