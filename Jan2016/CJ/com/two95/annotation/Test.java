package com.two95.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx =new ClassPathXmlApplicationContext("beanAnnotation.xml");
				   DisplayInfo d=(DisplayInfo) ctx.getBean("di");
				   d.display();
	}

}
