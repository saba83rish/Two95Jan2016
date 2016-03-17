package com.two95.Courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {

	String coursename;
	String duration;
	List<Student>students;
	List<Trainer>trainer;
	public Course(String coursename, String duration, List<Student> students, List<Trainer> trainer) {
		//super();
		this.coursename = coursename;
		this.duration = duration;
		this.students = students;
		this.trainer = trainer;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
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
	
	public void display(){
		System.out.println("Course [coursename=" + coursename + ", duration=" + duration +"]");
		System.out.println("trainer"+ trainer);	
		
				
	
	}
	
}
