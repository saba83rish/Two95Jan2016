package com.java.inheritance;

public class Person {
	
	private String dept;
	
	public Person(){
		
	}
	public Person( String dept) {
	
		this.dept=dept;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Person [dept="  + "]";
	}
	

}
