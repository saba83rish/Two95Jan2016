package com.two95.cards;

import java.util.List;


public class Suites {
	private String cardName;
	private String colour;
	private List<CardValue> cardValue;
	
	public Suites() {
		
	}

	public Suites(String cardName, String colour, List<CardValue> cardValue) {
		super();
		this.cardName = cardName;
		this.colour = colour;
		this.cardValue = cardValue;
	}

	@Override
	public String toString() {
		return "cardName = " + cardName + ", Card colour = " + colour + ", cardValues = " + cardValue ;
	}

}
