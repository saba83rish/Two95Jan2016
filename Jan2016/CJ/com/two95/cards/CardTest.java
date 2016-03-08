package com.two95.cards;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class CardTest {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("beanCards.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    Card card=(Card) factory.getBean("cards");
	    card.display();

	}

}
