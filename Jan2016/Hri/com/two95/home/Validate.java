package com.two95.home;

public class Validate {
	
	public void validate(String method) throws Exception{
		
		if(method.equals("rentHome")){
			throw new Exception("Do not rent home here");
		}
		
	}

}
