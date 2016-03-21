package com.two95.jdbcc;

public class Railways {

	private String trainNo;
	private String arrival;
	private String departure;
	
	public Railways(){
		
	}
	public Railways(String trainNo, String arrival, String departure) {
		super();
		this.trainNo = trainNo;
		this.arrival = arrival;
		this.departure = departure;
	}
	public String getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	@Override
	public String toString() {
		return "Railways [trainNo=" + trainNo + ", arrival=" + arrival + ", departure=" + departure + "]";
	}
	
	
	
}
