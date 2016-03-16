package com.two95.home;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object obj, Method method, Object[] obja, Object objb) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Inspect the building after "+method.getName());
	}

}
