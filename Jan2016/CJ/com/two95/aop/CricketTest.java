package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ctx=new ClassPathXmlApplicationContext("spgaopConf.xml");
Cricket cricket=(Cricket) ctx.getBean("proxy1");
cricket.twenty20();
cricket.onedayintl();
Checking c=(Checking) ctx.getBean("proxy");
try{  
    c.check(21);;  
    }
catch(Exception e)
{
	e.printStackTrace();
	}  
	}

}
