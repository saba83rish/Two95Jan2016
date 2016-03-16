package com.two95.home;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] obja, Object obj) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Land is purchased before " + method.getName());
	}

}
