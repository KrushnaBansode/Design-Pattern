package com.jspiders.designpattern.object;

public class Account {
private double accountBalance;
	
	static Account account=new Account(10000);
	
	private Account(double balance) {
		
		System.out.println("Account's constructor accessed");
		
		this.accountBalance=balance;
	}
	
	public static Account getAccount() {
		System.out.println("Account creation method accessed");
		return account;
	}


	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}



	

	
}
