package com.two95.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class AroundAdvisor implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		// TODO Auto-generated method stub
		  Object obj;  
	        System.out.println("additional bonus point before game if total score above 300");  
	        obj=arg0.proceed();  
	        System.out.println("additional bonus point after game if won by more than 8 wickets");  
	        return obj;
	}

	

}
