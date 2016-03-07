package com.two95.Card;

import java.util.List;

public class Clubs {
	String name;
	String color;
	List<String>values;
	public Clubs(String name, String color, List<String> values) {
		
		this.name = name;
		this.color = color;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Clubs [name=" + name + ", color=" + color + ", values=" + values + "]";
	}
}
