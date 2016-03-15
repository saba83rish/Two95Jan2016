package com.two95.aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class Engine {
	
	public void start() {
		System.out.println("Start the Engine");
	}
	
	public void stop() {
		System.out.println("Stop the Engine");
	}
	
	public void makeNoise(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("Engine makes noise before driving");
		jp.proceed();
		System.out.println("Engine makes noise after driving");
	}

}
