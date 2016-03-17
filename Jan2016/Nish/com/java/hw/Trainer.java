package com.java.hw;

public class Trainer {
	
	private String trainerName;
	private String trainerId;
	private String coursesHandle;
	
	public Trainer(String trainerName, String trainerId, String coursesHandle) {
		super();
		this.trainerName = trainerName;
		this.trainerId = trainerId;
		this.coursesHandle = coursesHandle;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerId() {
		return trainerId;
	}
	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}
	public String getCoursesHandle() {
		return coursesHandle;
	}
	public void setCoursesHandle(String coursesHandle) {
		this.coursesHandle = coursesHandle;
	}
	@Override
	public String toString() {
		return "Trainer:" + trainerName;
				//+ "trainerId=" + trainerId + ", coursesHandle=" + coursesHandle
				//+ "]";
	}
}
