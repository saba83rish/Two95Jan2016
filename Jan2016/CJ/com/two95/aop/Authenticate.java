package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Authenticate {
	public static void check(String user1,String pass)throws Exception
	{
		
        if(user1.equals("chr")&&pass.equals("cj")){  
        	
            BankingOperation.withdrawal();  
        }  
        else{  
            System.out.println("invalid username or password");  
        }  
    } 
	

}
