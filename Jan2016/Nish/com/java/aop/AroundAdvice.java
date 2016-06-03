package com.java.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		Object obj = null;
		System.out.println("Before the inventory");
		obj = mi.proceed();
		System.out.println("After the inventory");
		return null;
	}
}
