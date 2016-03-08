package com.two95.college;

public class Trainer {
	private String trainerName;

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

	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return trainerName;
	}
	

}
