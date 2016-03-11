package com.two95.parentbean;

import java.util.List;

public class AndroidExam extends Student{
	String examname;
	String trainer;
	
	public AndroidExam(){
		
	}

	public AndroidExam(String examname, String trainer) {
		
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
		return "AndroidExam [examname=" + examname + ", trainer=" + trainer +  "]";
	}
	
}
