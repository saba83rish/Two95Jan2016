package com.two95.hibernate.student.HibernateStudent;

public class Student implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int StudentId;
	private String FirstName;
	private String LastName;
	private String Gender;
	
	public Student(){
		
	}
	
	public Student(int studentId, String firstName, String lastName, String gender) {
		super();
		StudentId = studentId;
		FirstName = firstName;
		LastName = lastName;
		Gender = gender;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
}
