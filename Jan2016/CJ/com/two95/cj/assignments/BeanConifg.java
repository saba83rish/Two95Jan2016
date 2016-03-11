package com.two95.cj.assignments;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConifg {

	@Bean(name = "spade" , initMethod = "init"  , destroyMethod = "destroy")
	public Card spade()
	{
		Card c = new Card();
		c.setName("Spade");
		c.setColor("Black");
		c.setValues(getList());
		return c;
	}
	
	@Bean(name = "flower")
	public Card flower()
	{
		Card c = new Card();
		c.setName("Flower");
		c.setColor("Black");
		c.setValues(getList());
		return c;
	}
	
	@Bean(name = "diamond")
	public Card diamond()
	{
		Card c = new Card();
		c.setName("Diamond");
		c.setColor("Red");
		c.setValues(getList());
		return c;
	}
	
	@Bean(name = "heart")
	public Card heart()
	{
		Card c = new Card();
		c.setName("Heart");
		c.setColor("Red");
		c.setValues(getList());
		return c;
	}
	
	private List<String> getList()
	{
		List<String> cardValues = new ArrayList<String>();
		cardValues.add("A");cardValues.add("2");cardValues.add("3");cardValues.add("4");
		cardValues.add("5");cardValues.add("6");cardValues.add("7");cardValues.add("8");
		cardValues.add("9");cardValues.add("10");cardValues.add("J");cardValues.add("Q");
		cardValues.add("K");
		return cardValues;
	}
}
