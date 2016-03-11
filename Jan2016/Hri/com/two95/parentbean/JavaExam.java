package com.two95.parentbean;

import java.util.List;

//import java.awt.List;

public class JavaExam extends Student{
	
	String examname;
	String trainer;
	
	
	public JavaExam(){
		
	}
	
	public JavaExam(String examname, String trainer) {
		
		this.examname = examname;
		this.trainer = trainer;
		
		
	}
	
	public String getExamname() {
		return examname;
	}
	public void setExamname(String examname) {
		this.examname = examname;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	
	@Override
	public String toString() {
		return "JavaExam [examname=" + examname + ", trainer=" + trainer + "]";
	}
	
	
}