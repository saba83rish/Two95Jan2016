package com.two95.Courses;

import java.util.List;

public class Trainer {

	String trainername;
	String id;
	String course;
	
	
	public Trainer(String trainername, String id, String course) {
		super();
		this.trainername = trainername;
		this.id = id;
		this.course = course;
	}
	public String getTrainername() {
		return trainername;
	}
	public void setTrainername(String trainername) {
		this.trainername = trainername;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return " [trainername=" + trainername + ", id=" + id + ", course=" + course + "]";
	}
}
