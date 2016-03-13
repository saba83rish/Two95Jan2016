package com.two95.Card;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.two95.Card.Cards;

public class CardTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Card.xml"));
		Cards s=(Cards) factory.getBean("s1");
		s.display_clubs();
		s.display_spade();
		s.display_diamonds();
		s.display_hearts();
	}

}
