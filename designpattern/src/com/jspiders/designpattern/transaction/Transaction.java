package com.jspiders.designpattern.transaction;

import java.util.Scanner;

import com.jspiders.designpattern.object.Account;
import com.jspiders.designpattern.object.CheckBalance;
import com.jspiders.designpattern.object.Deposit;
import com.jspiders.designpattern.object.Withdraw;

public class Transaction {
	static boolean loop = true;
	static Scanner scanner;
	static Account account=Account.getAccount();
	

	public static void main(String[] args) {
		
		while (loop) {
			operations();
		}
	}

	public static void operations() {
		System.out.println("\nPlease select one of the below operations" + "\n1. Withdraw amount from account"
				+ "\n2. Deposite amount in account" + "\n3. Check account balance" + "\n4.Exit");
		scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1: {
			System.out.println("Please enter amount to Withdraw");
			double amount=scanner.nextDouble();
			Withdraw withdraw=new Withdraw(amount,account);
			break;
		}
		case 2: {

			System.out.println("Please enter amount to Deposite");
			double amount=scanner.nextDouble();
			Deposit deposite=new Deposit(amount,account);
			break;
		}
		
		case 3: {
			CheckBalance checkBalance=new CheckBalance(account);
			break;
		}
		case 4: {

			System.out.println("Thank you...");
			loop=false;
			scanner.close();
			break;
		}
		default:
			System.out.println("Invalid choice please try again.");
		}

	}

     
}
