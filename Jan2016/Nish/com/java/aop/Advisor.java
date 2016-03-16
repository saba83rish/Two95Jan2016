package com.java.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Advisor implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] objs, Object arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Counting the books.. Method:"+method.getName()+ " "+ method.getModifiers());
		
	}

}
