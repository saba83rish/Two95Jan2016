package com.two95.home;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext fac=new ClassPathXmlApplicationContext("Home.xml");
		BuildingHome h=(BuildingHome)fac.getBean("proxy","home");
		
		h.buildHome();
		Validate v=fac.getBean("proxyvalidate",Validate.class);
		try{
			v.validate("rentHome");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
