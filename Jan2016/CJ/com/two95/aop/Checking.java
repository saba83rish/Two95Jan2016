package com.two95.aop;

public class Checking {
	public void check(int over)throws Exception{  
        if(over<20){  
            throw new ArithmeticException("Game dropped");  
        }  
        else{  
            System.out.println("game can begin");  
        }  
    } 

}
