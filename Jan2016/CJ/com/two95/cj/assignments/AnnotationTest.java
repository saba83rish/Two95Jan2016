package com.two95.cj.assignments;

import org.springframework.beans.factory.wiring.BeanConfigurerSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AnnotationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(BeanConifg.class);
		factory.registerShutdownHook();
		Card spade = (Card) factory.getBean("spade");
		Card heart =  (Card) factory.getBean("heart");
		Card diamond =  (Card) factory.getBean("diamond");
		Card flower =  (Card) factory.getBean("flower");
		System.out.println(spade);
		System.out.println(heart);
		System.out.println(diamond);
		System.out.println(flower);
	}

}
