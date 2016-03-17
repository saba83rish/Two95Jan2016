package com.two95.college;

import java.util.Collections;
import java.util.List;

public class Course {
	private String courseName;
	private String courseDuration;
	private String courseFee;
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
	
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public String getCourseFee() {
		return courseFee;
	}
	public void setCourseFee(String courseFee) {
		this.courseFee = courseFee;
	}
	
	public Course(String courseName, String courseDuration, String courseFee, List<Trainer> trainer,
			List<Student> student) {
		super();
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseFee = courseFee;
		this.trainer = trainer;
		this.student = student;
	}
	public Course() {
		
	}
	@Override
	public String toString() {
		return "courseName = " + courseName + ", trainers are:" + trainer + ", students enrolled are: " + student;
	}
	
	

}
