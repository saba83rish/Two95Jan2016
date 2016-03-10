package com.two95.Card;

import java.util.List;

public class Hearts {
	String name;
	String color;
	List<String>values;
	public Hearts(String name, String color, List<String> values) {
		
		this.name = name;
		this.color = color;
		this.values = values;
	}
	@Override
	public String toString() {
		return "Hearts [name=" + name + ", color=" + color + ", values=" + values + "]";
	}
}
