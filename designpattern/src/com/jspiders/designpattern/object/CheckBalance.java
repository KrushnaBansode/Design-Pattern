package com.jspiders.designpattern.object;

public class CheckBalance {
Account account;
	
	public CheckBalance(Account account) {
		
		this.account=account;
		checkAccountBal();
	}
	
	private void checkAccountBal() {
		
		System.out.print("Current Balance : "+account.getAccountBalance());
		
	} 
}
