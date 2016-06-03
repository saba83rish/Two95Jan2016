package com.two95.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class DisplayInfo {
	private Student student;
	private Trainer trainer;
	private Manager manager;
	@Autowired
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Autowired
	public DisplayInfo(Student student, Trainer trainer, Manager manager) {
		super();
		this.student = student;
		this.trainer = trainer;
		this.manager = manager;
	}
	public void display()
	{
		System.out.println(student+" "+trainer+ " "+manager);
	}
	

}
