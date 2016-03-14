package com.two95.annotationConf;

import org.springframework.beans.factory.annotation.Autowired;

public class DisplayInfo {
	private Student student;
	private Trainer trainer;
	private Manager manager;
	public Student getStudent() {
		return student;
	}
	@Autowired
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public Trainer getTrainer() {
		return trainer;
	}
	@Autowired
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	public Manager getManager() {
		return manager;
	}
	@Autowired
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public DisplayInfo(Student student, Trainer trainer, Manager manager) {
		//super();
		this.student = student;
		this.trainer = trainer;
		this.manager = manager;
		
	}
	
	public DisplayInfo() {
		super();
		//TODO Auto-generated constructor stub
	}
	
	public void display()
	{
		
		System.out.println(student+" "+trainer+ " "+manager);
	}
	

}
