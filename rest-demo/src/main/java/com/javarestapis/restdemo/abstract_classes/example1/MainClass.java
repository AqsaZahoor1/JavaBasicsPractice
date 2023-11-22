package com.javarestapis.restdemo.abstract_classes.example1;

public class MainClass {

	public static void main(String[] args) {
		
		
		Bank b = new Meezan();       // Meezan is calling Abstract class methods
		
		b.getInterestRate();
		
		b.callAbstractClassMethod();

		b.cantChangeBody();

		b= new Habib();              // Habib is calling own methods , same declared and defined in absract class
		
		b.getInterestRate();
		
		b.callAbstractClassMethod();

		b.cantChangeBody();
		
	}

}
