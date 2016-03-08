package com.two95.nish.homeworks.cards;

import java.util.List;

public class Clubs {
	private String color;
	private String suite;
	private List<String>value;
	public Clubs(String color, String suite, List<String> value) {
		super();
		this.color = color;
		this.suite = suite;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Clubs [color=" + color + ", suite=" + suite + ", value=" + value + "]";
	}


}
