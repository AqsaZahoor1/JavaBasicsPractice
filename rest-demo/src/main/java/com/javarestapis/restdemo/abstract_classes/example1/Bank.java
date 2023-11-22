package com.javarestapis.restdemo.abstract_classes.example1;
 abstract class Bank {
	 
	 public Bank() {
		 
		 System.out.println("Constructor odf Abstract Class");
	 }
	
	abstract void getInterestRate();
	
	
	void callAbstractClassMethod() {
		
		System.out.println(" Abstract class method called");
	}
	
	void cantChangeBody () {
		
		System.out.println("Method in Astract class");
	}
	
	 final void methodWithFinalKeyword() {
		 	 
		 System.out.println("Final method called");
	}
	 
	 //	void simpleMethod(); 
}
