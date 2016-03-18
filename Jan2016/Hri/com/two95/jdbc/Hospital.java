package com.two95.jdbc;

public class Hospital {

	private int patient_id;
	private String Name;
	private String ConsultingDoctor;
	private int fees;
	
	public Hospital(){
		
	}
	public Hospital(int patient_id, String name, String consultingDoctor, int fees) {
		super();
		this.patient_id = patient_id;
		Name = name;
		ConsultingDoctor = consultingDoctor;
		this.fees = fees;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getConsultingDoctor() {
		return ConsultingDoctor;
	}
	public void setConsultingDoctor(String consultingDoctor) {
		ConsultingDoctor = consultingDoctor;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
}
