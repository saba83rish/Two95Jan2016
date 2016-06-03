package com.two95.annotationConf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class AnnoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = 
			      new AnnotationConfigApplicationContext(BeanAnnoConfig.class);
		
		Student st=(Student) ctx.getBean("student");
		Trainer tr=(Trainer) ctx.getBean("trainer");
		Manager mg=(Manager) ctx.getBean("manager");
		DisplayInfo d=(DisplayInfo) ctx.getBean(DisplayInfo.class);
		d.display();
				
	}

}
