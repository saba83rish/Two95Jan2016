package com.java.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class CustomerTest {
	public static void main(String[] args){
		BeanFactory factory = new XmlBeanFactory (new FileSystemResource("Map.xml"));
		Customer cust = (Customer)factory.getBean("customer");
	      System.out.println(cust);
	
	}

}