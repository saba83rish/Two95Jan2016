package com.java.annotations;


public class Student {

	private String stuName;
	private int age;
  
	public Student() {

	}
	public Student(String stuName, int age) {
		this.stuName = stuName;
		this.age = age;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + stuName + ", age=" + age + "]";
	}
}
