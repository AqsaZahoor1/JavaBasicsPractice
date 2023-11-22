package com.javarestapis.restdemo.utils;

public interface Account {
	
	public void depost(double amount);
	
	public void withdraw(double amount);
	
	public void calculateInterest();
	
	public void viewbalance();

}
