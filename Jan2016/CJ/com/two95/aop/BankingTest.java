package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankingTest 
{
	public static void main(String[] args) throws Throwable 
	{
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bankingConf.xml");
		Customer c=(Customer) ctx.getBean("cust");
		System.out.println(c);
		Bank ba=(Bank) ctx.getBean("proxy");
		BankingOperation.setDepositAmt(1000);
		System.out.println("Amount depositing is "+BankingOperation.getDepositAmt());
		ba.deposit();
		BankingOperation.setWithdrawalAmount(500);
		System.out.println("Amount looking to withdraw is "+BankingOperation.getWithdrawalAmount());
		ba.withdrawal();
		ba.balcheck();
	}

}
