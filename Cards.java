package com.two95.Card;

import java.util.Iterator;
import java.util.List;

public class Cards {

	List<Spade>spade;
	List<Clubs>clubs;
	List<Hearts>hearts;
	List<Diamonds>diamond;
	
	public Cards(List<Spade> spade, List<Clubs> clubs, List<Hearts> hearts, List<Diamonds> diamond) {
		
		this.spade = spade;
		this.clubs = clubs;
		this.hearts = hearts;
		this.diamond = diamond;
	}
	
	public void display_spade(){
		
		Iterator r=spade.iterator();
		while(r.hasNext()){
			System.out.println(r.next());
		}
	}
		public void display_clubs(){
			
			Iterator r1=clubs.iterator();
			while(r1.hasNext()){
				System.out.println(r1.next());
			}
			
	}
public void display_hearts(){
			
			Iterator r2=hearts.iterator();
			while(r2.hasNext()){
				System.out.println(r2.next());
			}
			
	}
public void display_diamonds(){
	
	Iterator r3=diamond.iterator();
	while(r3.hasNext()){
		System.out.println(r3.next());
	}
	
}
}
