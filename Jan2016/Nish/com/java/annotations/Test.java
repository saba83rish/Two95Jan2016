package com.java.annotations;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
	public static void main(String[]args){
		
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("information.xml");
		Information i = (Information) factory.getBean("info");
		i.displayInfo();
        
	}
}