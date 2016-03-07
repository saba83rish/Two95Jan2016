package com.two95.Card;

import java.util.List;

public class Diamonds {
	String name;
	String color;
	List<String>values;
	public Diamonds(String name, String color, List<String> values) {
		
		this.name = name;
		this.color = color;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Diamonds [name=" + name + ", color=" + color + ", values=" + values + "]";
	}
}
