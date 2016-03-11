package com.java.inheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args){	
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("Employee.xml");
		Employee e = (Employee) factory.getBean("employeebean");
		System.out.println(e);  
		System.out.println(e.getDept());
		Manager m = (Manager) factory.getBean("managerbean");
		System.out.println(m);
		System.out.println(m.getDept());
	}
}