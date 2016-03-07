package com.two95.Card;

import java.util.List;

public class Spade {

	String name;
	String color;
	List<String>values;
	public Spade(String name, String color, List<String> values) {
		
		this.name = name;
		this.color = color;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Spade [name=" + name + ", color=" + color + ", values=" + values + "]";
	}
	
}
