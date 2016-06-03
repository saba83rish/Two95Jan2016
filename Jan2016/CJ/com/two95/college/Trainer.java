package com.two95.college;

public class Trainer {
	private String trainerName;
	private String trainerId;
	private String courseHandled;

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Trainer(String trainerName) {
		super();
		this.trainerName = trainerName;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public String getCourseHandled() {
		return courseHandled;
	}

	public void setCourseHandled(String courseHandled) {
		this.courseHandled = courseHandled;
	}

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trainer(String trainerName, String trainerId, String courseHandled) {
		super();
		this.trainerName = trainerName;
		this.trainerId = trainerId;
		this.courseHandled = courseHandled;
	}

	@Override
	public String toString() {
		return trainerName;
	}
	

}
