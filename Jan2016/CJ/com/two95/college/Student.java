package com.two95.college;

import java.util.ArrayList;
import java.util.List;

public class Student {
private String studentName;
private String studentId;
private String courseAtt;



public Student(String studentName, String studentId, String courseAtt) {
	super();
	this.studentName = studentName;
	this.studentId = studentId;
	this.courseAtt = courseAtt;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentId() {
	return studentId;
}

public void setStudentId(String studentId) {
	this.studentId = studentId;
}

public String getCourseAtt() {
	return courseAtt;
}

public void setCourseAtt(String courseAtt) {
	this.courseAtt = courseAtt;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return studentName;
}

}
