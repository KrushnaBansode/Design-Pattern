package com.jspiders.designpattern.object;

public class Withdraw {
	Account account;

	public Withdraw(double amount,Account account) {
		
		this.account=account;
		withdraw(amount);
	}
	
	private void withdraw(double amount) {
		
		
		if (amount<=account.getAccountBalance()) {
			
			System.out.println("Withdrawing amount : "+amount+" from account");
			
			account.setAccountBalance((account.getAccountBalance())-amount);
			
			System.out.println("Current Account Balance : "+account.getAccountBalance());
			
		}else {
			System.out.println("Insufficient Account Balance");
		}
		
	}
}
