package com.two95.home;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		// TODO Auto-generated method stub
		Object o;
		System.out.println("Before building a home");
		o=method.proceed();
		System.out.println("After building a home");
		return o;
	}

	

}
