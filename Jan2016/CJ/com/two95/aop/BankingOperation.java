package com.two95.aop;

public class BankingOperation {
	private static double depositAmt;
	private static double withdrawalAmount;
	public static double balance;
	
public static double getDepositAmt() {
		return depositAmt;
	}
	public static void setDepositAmt(double depositAmt) {
		BankingOperation.depositAmt = depositAmt;
	}
	public static double getWithdrawalAmount() {
		return withdrawalAmount;
	}
	public static void setWithdrawalAmount(double withdrawalAmount) {
		BankingOperation.withdrawalAmount = withdrawalAmount;
	}
public static void deposit()
{
	balance =balance+depositAmt;
	System.out.println("deposited the money");
	System.out.println("balance is "+balance );
}
public static void withdrawal()
{
	balance=balance-withdrawalAmount;
	System.out.println("withdrawed the money");
	System.out.println("balance is "+balance );
}
public static void checkBal()
{
	System.out.println("balance is "+balance );
	System.out.println("balance is checked");
}
}
