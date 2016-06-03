package com.java.config;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(EmployeeConfig.class);
		
		Employee emp1 = (Employee) factory.getBean("emp1");
		Employee emp2 = (Employee) factory.getBean("emp2");
		Employee emp3 = (Employee) factory.getBean("emp3");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
	}}