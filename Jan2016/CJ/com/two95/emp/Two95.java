package com.two95.emp;

import java.util.Iterator;
import java.util.List;

import com.two95.cards.Suites;

public class Two95 {
	private List<Team> team;

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}

	public Two95() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Two95(List<Team> team) {
		super();
		this.team = team;
	}
	public void display()
	{
		 Iterator<Team> itr=team.iterator();  
		    while(itr.hasNext()){  
		    	 System.out.println(itr.next());   
		    } 
	}

}
