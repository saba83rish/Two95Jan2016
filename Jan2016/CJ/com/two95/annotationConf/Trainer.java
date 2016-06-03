package com.two95.annotationConf;

public class Trainer {
private String trainerName;

public Trainer(String trainerName) {
	super();
	this.trainerName = trainerName;
}

public Trainer() {
	super();
	// TODO Auto-generated constructor stub
}



public String getTrainerName() {
	return trainerName;
}

public void setTrainerName(String trainerName) {
	this.trainerName = trainerName;
}

@Override
public String toString() {
	return "Trainer [trainerName=" + trainerName + "]";
}

}
