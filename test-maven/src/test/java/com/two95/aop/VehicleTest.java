package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class VehicleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Car car = (Car) context.getBean("car");
		car.drive();
		System.out.println("---------------------------");
		Truck truck = (Truck) context.getBean("truck");
		truck.drive();
	}

}
