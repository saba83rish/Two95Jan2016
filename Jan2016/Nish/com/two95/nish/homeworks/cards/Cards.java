package com.two95.nish.homeworks.cards;

import java.util.Iterator;
import java.util.List;

public class Cards {
	private List<Clubs> clubs;
	private List<Hearts> hearts;
	private List<Dice> dice;
	private List<Spade> spade;

	public Cards(List<Clubs> clubs, List<Hearts> hearts, List<Dice> dice, List<Spade> spade) {
		super();
		this.clubs = clubs;
		this.hearts = hearts;
		this.dice = dice;
		this.spade = spade;
	}

	public void displayClubs() {
		Iterator c = clubs.iterator();
		while (c.hasNext()) {
			System.out.println(c.next());
		}
	}

	public void displayHearts() {
		Iterator h = hearts.iterator();
		while (h.hasNext()) {
			System.out.println(h.next());

		}
	}

	public void displayDice() {
		Iterator d = dice.iterator();
		while (d.hasNext()) {
			System.out.println(d.next());
		}
	}

	public void displaySpade() {
		Iterator s = spade.iterator();
		while (s.hasNext()) {
			System.out.println(s.next());
		}
	}

}
