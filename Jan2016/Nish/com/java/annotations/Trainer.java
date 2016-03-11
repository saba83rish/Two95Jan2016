package com.java.annotations;

public class Trainer {
	private String trainerName;
	private String trainerID;
	public Trainer(){
		
	}
	public Trainer(String trainerName, String trainerID) {
		super();
		this.trainerName = trainerName;
		this.trainerID = trainerID;
	}
	public String getTrainerName() {
		return trainerName;
	}
	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}
	public String getTrainerID() {
		return trainerID;
	}
	public void setTrainerID(String trainerID) {
		this.trainerID = trainerID;
	}
	@Override
	public String toString() {
		return "Trainer [trainerName=" + trainerName + ", trainerID=" + trainerID + "]";
	}
	

}
