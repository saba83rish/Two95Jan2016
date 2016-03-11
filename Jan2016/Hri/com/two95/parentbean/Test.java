package com.two95.parentbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args){

	@SuppressWarnings("resource")
	ApplicationContext factory=new ClassPathXmlApplicationContext("SubjectTest.xml");
	JavaExam java=(JavaExam)factory.getBean("java1");
	System.out.println(java);
	System.out.println(java.getStudent());
	
	System.out.println("-------------------------------------------------------------------------------------------------");
	
	AndroidExam android=(AndroidExam)factory.getBean("android1");
	System.out.println(android);
	System.out.println(android.getStudent());
	}
}
