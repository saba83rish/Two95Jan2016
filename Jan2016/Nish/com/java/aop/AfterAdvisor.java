package com.java.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvisor implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object objs, Method method, Object[] arg2, Object arg3) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Books Inventory Finished.. Method:" +method.getName()+ " "+method.getModifiers());
		
	}

}
