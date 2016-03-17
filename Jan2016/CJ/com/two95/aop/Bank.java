package com.two95.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bank {
	public String bankName;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(String bankName) {
		super();
		this.bankName = bankName;
	}
public void deposit()
{
	System.out.println("need to deposit");
	BankingOperation.deposit();
}
public void withdrawal() throws Exception
{
	System.out.println("need to withdraw");
	ApplicationContext ctx=new ClassPathXmlApplicationContext("bankingConf.xml");
	Authenticate ae=(Authenticate) ctx.getBean("proxy1");
	ae.check();
}
public void balcheck()
{
	System.out.println("need to check balance");
	BankingOperation.checkBal();
}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + "]";
	}
	

}
