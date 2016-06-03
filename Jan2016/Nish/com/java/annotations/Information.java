package com.java.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class Information {
	
	private Student students;
	private Trainer trainer;
	private Manager manager;

	public Information(){
		
	}
	@Autowired
	public Information(Student students, Trainer trainer, Manager manager) {
		super();
		this.students = students;
		this.trainer = trainer;
		this.manager = manager;
	}
	
	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public void displayInfo(){
		System.out.println(students+" " +trainer+" " +manager+ " ");
	}
}
