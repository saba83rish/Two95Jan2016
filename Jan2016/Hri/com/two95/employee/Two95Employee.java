package com.two95.employee;
//creating a employee class
import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;




public class Two95Employee  {

	List<Team>team;
	

	public Two95Employee(List<Team> team) {
		
		this.team = team;
	}

	public List<Team> getTeam() {
		return team;
	}

	public void setTeam(List<Team> team) {
		this.team = team;
	}
	

	
	
		
public void displayemp(){
	
	//System.out.println("Recruiting team");
	
	Iterator r=team.iterator();
	while(r.hasNext()){
		System.out.println(r.next());
		
	}
}}



		

	

