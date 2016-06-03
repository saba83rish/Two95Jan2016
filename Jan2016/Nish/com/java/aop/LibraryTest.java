package com.java.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryTest {

	public static void main(String[]args){
		ApplicationContext factory = new ClassPathXmlApplicationContext("LibraryAop.xml");
		Library lib = (Library) factory.getBean("proxy", "lib");
		lib.totalBooks();
		lib.updateBooks();
		Validate v = factory.getBean("proxyVal", Validate.class);
		try{
		   v.validate(4000);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
