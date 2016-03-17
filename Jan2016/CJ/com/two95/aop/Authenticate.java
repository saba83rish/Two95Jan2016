package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Authenticate {
	public static void check()throws Exception
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bankingConf.xml");
		Customer c=(Customer) ctx.getBean("cust");
		String user1=c.getUsername();
		
		String pass=c.getPassword();
		
        if(user1.equals("ch")&&pass.equals("cj")){  
        	
            BankingOperation.withdrawal();  
        }  
        else{  
            System.out.println("invalid username or password");  
        }  
    } 
	

}
