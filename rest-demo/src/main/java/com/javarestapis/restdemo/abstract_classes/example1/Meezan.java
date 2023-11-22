package com.javarestapis.restdemo.abstract_classes.example1;

public class Meezan extends Bank {
	
	private int interestRate  = 0;

	@Override
	void getInterestRate() {
		System.out.println("Interest Rate of Meezan bank is " + interestRate);
		
	}

}
