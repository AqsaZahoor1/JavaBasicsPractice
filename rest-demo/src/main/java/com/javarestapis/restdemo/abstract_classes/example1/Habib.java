package com.javarestapis.restdemo.abstract_classes.example1;

public class Habib extends Bank {
	
	private int interestRate = 20;

	@Override
	void getInterestRate() {
	
		System.out.println("Interest Rate of Habib bank is " + interestRate);
	}
	
	void cantChangeBody() {
		System.out.println("Method of Habib bank class executed");          
	}

	void callAbstractClassMethod() {
		System.out.println("Method of Habib bank class executed");
	}
	
	
//	final void methodWithFinalKeyword() {     // Cannot override final method from Absract class
//		 	 
//		 System.out.println("Final method called");
//	}
}
