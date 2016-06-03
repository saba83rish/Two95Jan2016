package com.two95.nish.homeworks.cards;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class CardsTest {

	public static void main(String[] args) {

		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beansCard.xml"));
		Cards c = (Cards) factory.getBean("cards");
		c.displayClubs();
		c.displayDice();
		c.displayHearts();
		c.displaySpade();

}}
