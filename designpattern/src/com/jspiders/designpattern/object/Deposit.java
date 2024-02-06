package com.jspiders.designpattern.object;

public class Deposit {
Account account;
	
	public Deposit(double amount,Account account) {
		this.account=account;
		deposit(amount);
		
	}
	
	private void deposit(double amount) {
		
		System.out.println("Depositing amount : "+amount+" in Account");
		
		account.setAccountBalance((account.getAccountBalance())+amount);
		
		System.out.println("Deposite complete...Current Account Balance : "+account.getAccountBalance());
		
	}
}

