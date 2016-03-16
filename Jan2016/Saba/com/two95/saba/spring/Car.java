package com.two95.saba.spring;

public class Car {
	
	private Tyre tyre;
	
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void moveForward() {
	
		System.out.println("Tyre with model "+tyre.getModel()+" makes the car move forward");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		Tyre t = new Tyre();
		t.setMaker("Michelin");
		t.setModel("AX001234");
		t.setPrice(56.23f);
		
		Tyre t2=new Tyre();
		t2.setMaker("Good Year");
		t2.setModel("FT123");
		t2.setPrice(58.23f);
		c.setTyre(t2);
		c.moveForward();
	}

}
