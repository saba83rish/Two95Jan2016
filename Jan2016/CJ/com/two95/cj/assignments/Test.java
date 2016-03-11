package com.two95.cj.assignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("springCard.xml");
		factory.registerShutdownHook();
//		CardValue cv = (CardValue)factory.getBean("cardValues");
//		System.out.println(cv.getValues());
		Card spade = (Card)factory.getBean("spade");
		Card flower = (Card)factory.getBean("flower");
		Card heart = (Card)factory.getBean("heart");
		Card diamond = (Card)factory.getBean("diamond");
		System.out.println(spade);
		System.out.println(flower);
		System.out.println(heart);
		System.out.println(diamond);

	}

}
