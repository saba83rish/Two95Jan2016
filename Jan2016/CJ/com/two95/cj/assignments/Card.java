package com.two95.cj.assignments;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Required;

public class Card {
	private String name;
	private String color;
	private List<String> values;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Card [name=" + name + ", color=" + color + ", values=" + values + "]";
	}
	public String getColor() {
		return color;
	}
	@Required
	public void setColor(String color) {
		this.color = color;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	//@PostConstruct
	public void init()
	{
		System.out.println("Bean Initialization Method" + name);
	}
	//@PreDestroy
	public void destroy()
	{
		System.out.println("Bean is gonna be destroyed");
	}
}
