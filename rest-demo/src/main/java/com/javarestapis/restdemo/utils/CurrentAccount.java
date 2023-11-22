package com.javarestapis.restdemo.utils;

public class CurrentAccount implements Account {
	
	private double balance = 0 ;

	@Override
	public void depost(double amount) {
		
		this.balance = balance + amount;
		System.out.print(" Depost in current account " + balance);
		
	}

	@Override
	public void withdraw(double amount) {
		
		this.balance = balance - amount;
		System.out.print(" Withdrawal form current account " + balance);
		
	}

	@Override
	public void calculateInterest() {
		System.out.print("Calculate interest for current account");
		
	}

	@Override
	public void viewbalance() {
		System.out.print("Your balance current account" + balance);
		
	}
	
	

}
