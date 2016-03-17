package com.two95.Courses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

//import com.two95.course.Course;

public class CourseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext factory=new ClassPathXmlApplicationContext("StudentCourse.xml");
		Course ui=(Course) factory.getBean("h");
		Course ui1=(Course) factory.getBean("i");
		Course ui2=(Course)factory.getBean("j");
		
		System.out.println("--------------------------------------");
		List<Student> javaStud=ui.getStudents();
		ui.display();
		Collections.sort(javaStud);
		System.out.println(javaStud);
		
		System.out.println("---------------------------------------");
		List<Student> androidStud=ui1.getStudents();
		ui.display();
		Collections.sort(androidStud);
		System.out.println(androidStud);
		
		System.out.println("----------------------------------------");
		List<Student> hadoopStud=ui1.getStudents();
		ui.display();
		Collections.sort(hadoopStud);
		System.out.println(hadoopStud);
		
		//ui.display();
		/*
		//ui2.display();
		
		System.out.println("-----------------------------");
		ui.display();
		List<Student> javabatch=ui.getStudents();
		List<String >l=new ArrayList<String>();
		
		for(Student studnames:javabatch){
			String javastudnames=studnames.getName();
			l.add(javastudnames);
			Collections.sort(l);
		}
		
		System.out.println("Students"+l);
		
		
		System.out.println("---------------------------------");
		ui1.display();
		List<Student> androidbatch=ui1.getStudents();
		List<String >l1=new ArrayList<String>();
		
		for(Student studnames:androidbatch){
			String androidstudnames=studnames.getName();
			l1.add(androidstudnames);
			Collections.sort(l1);
		}
		
		System.out.println("Students"+l1);
		
//System.out.println("Students"+l);
		
		
		System.out.println("---------------------------------");
		ui2.display();
		List<Student> hadoopbatch=ui2.getStudents();
		List<String >l2=new ArrayList<String>();
		
		for(Student studnames:hadoopbatch){
			String hadoopstudnames=studnames.getName();
			l2.add(hadoopstudnames);
			Collections.sort(l2);
		}
		
		System.out.println("Students"+l2);
		*/
		
		
	}
	

}
