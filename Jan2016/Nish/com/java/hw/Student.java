package com.java.hw;

public class Student implements Comparable{
	
	private String stuName;
	private String stuID;
	private String courseTaken;
	
	public Student(String stuName, String stuID, String courseTaken) {
		super();
		this.stuName = stuName;
		this.stuID = stuID;
		this.courseTaken = courseTaken;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuID() {
		return stuID;
	}
	public void setStuID(String stuID) {
		this.stuID = stuID;
	}
	public String getCourseTaken() {
		return courseTaken;
	}
	public void setCourseTaken(String courseTaken) {
		this.courseTaken = courseTaken;
	}
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s = (Student) o;
		return stuName.compareToIgnoreCase(s.getStuName());
	}
	@Override
	public String toString() {
		return "" + stuName;
				//+ " stuID=" + stuID + ", courseTaken=" + courseTaken + "]";
	}
}
