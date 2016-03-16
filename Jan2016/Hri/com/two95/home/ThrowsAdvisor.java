package com.two95.home;

import org.aspectj.apache.bcel.classfile.Method;
import org.springframework.aop.ThrowsAdvice;

public class ThrowsAdvisor implements ThrowsAdvice {

	public void afterThrowing(Exception e){
		System.out.println("exception concerned here");
	}
}
