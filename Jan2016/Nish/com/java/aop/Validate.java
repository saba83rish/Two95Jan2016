package com.java.aop;

public class Validate  {

	public void validate(int totalBooks) throws Exception {
		
		if (totalBooks < 5000) {
			throw new Exception("Some of the Books are Missing");
		}
		else{
			System.out.println("All Books are in the library.");
		}
	}

}
