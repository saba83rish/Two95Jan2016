package com.java.collections;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class OfficeTest {
	public static void main(String[] args){
		BeanFactory factory = new XmlBeanFactory (new FileSystemResource("BeansOffice.xml"));
		Office o = (Office) factory.getBean("office");
		o.displayInfo();
}}
