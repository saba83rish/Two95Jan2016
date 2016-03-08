package com.java.courses;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class CoursesTest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beansCourses.xml"));
		Courses c1 = (Courses) factory.getBean("courses1");
		Courses c2 = (Courses) factory.getBean("courses2");
		Courses c3 = (Courses) factory.getBean("courses3");

		// Getting Java Information
		List<Student> st = c1.getStudents();
		List<String> s1 = new ArrayList<String>();
		for (Student s : st) {
			String stuName = s.getStuName();
			s1.add(stuName);}
		Collections.sort(s1);
		c1.displayInfo();
		System.out.println("Java Students: " + s1);
	
		// Getting Android Information
		List<Student> st2 = c2.getStudents();
		List<String> s2 = new ArrayList<String>();
		for (Student s0 : st2) {
			String stuName = s0.getStuName();
			s2.add(stuName);}
		Collections.sort(s2);
		c2.displayInfo();
		System.out.println("Android Students: \n" + s2);
		
		// Getting Hadoop Students
		List<Student> st3 = c3.getStudents();
		List<String> s3 = new ArrayList<String>();
		for (Student sl : st3) {
			String stuName = sl.getStuName();
			s3.add(stuName);}
		Collections.sort(s3);
		c3.displayInfo();
		System.out.println("Hadoop Students: \n" + s3);
	}
}
