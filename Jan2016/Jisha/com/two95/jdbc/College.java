package com.two95.jdbc;

public class College {
private int student_id;
private String  student_name;
private String major;

public College(){
	
}
public College(int student_id, String student_name, String major) {
	super();
	this.student_id = student_id;
	this.student_name = student_name;
	this.major = major;
}
public int getStudent_id() {
	return student_id;
}
public void setStudent_id(int student_id) {
	this.student_id = student_id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}

}
