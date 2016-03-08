package com.two95.cards;

import java.util.Iterator;
import java.util.List;


public class Card {
	private List<Suites> suite;

	public Card() {
		
	}

	public Card(List<Suites> suite) {
		super();
		this.suite = suite;
	}
	public void display(){  
	        
	    Iterator<Suites> itr=suite.iterator();  
	    while(itr.hasNext()){  
	    	 System.out.println(itr.next());   
	    }  
	}
}
