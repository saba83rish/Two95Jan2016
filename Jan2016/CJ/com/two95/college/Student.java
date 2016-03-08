package com.two95.college;

public class Student {
private String studentName;

public Student(String studentName) {
	super();
	this.studentName = studentName;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
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
