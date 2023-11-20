package com.javarestapis.restdemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
		
		//System.out.print("Sprint boot project");
		
		
		
		// java basics practice questions
		
//		1-
		
		System.out.print("Hello \nAqsa Zahoor\n");
		
//		2
		int a = 74;
		int b = 36;
		int sum = a+b;
		System.out.print(sum+"\n");
		
//		3
		int num1 = 50;
		int num2 = 3;
		int c = num1/num2;
		System.out.print(c+"\n");
		
//	4
		int res1 = -5 + 8 * 6;
		int res2 = (55+9) % 9;
		int res3 = 20 + -3*5 / 8;
		int res4 = 5 + 15 / 3 * 2 - 8 % 3;
		
		System.out.print(res1+"\n"+res2+"\n"+res3+"\n"+res4);
		
		
		
//		5
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number\n");
		
		int first = sc.nextInt();
		
		System.out.print("Enter second number\n");
		
		int second = sc.nextInt();
		
		System.out.print(first + "*" + second +"=" +first*second+"\n");
		
//		6
		
		System.out.println(125 % 24);
		
//		7
		
//		Print table of 8 till 10
		
		for  (int i=1 ; i<=10; i++) {
			System.out.print("\n"+ "8 * "+ i + " = " + 8*i + "\n" );
		}
		
//		8
		
		System.out.print(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))+"\n");
		
		System.out.print("   J    a  v     v a\n");
		System.out.print("   J   a a  v   v a a\n");
		System.out.print("J  J  aaaaa  V V aaaaa\n");
		System.out.print("   J a     a  V a     a\n");
		
//		11
		
//		Circle
		double radius = 7.5;
		
		System.out.print("Perimeter: = " + 2*Math.PI*radius + "\n" );
		
//		11
		
		
		System.out.print("Area: = " + Math.PI* (radius*radius) + "\n" );
		
		
		// 15 swap two variables.
		
		int n1 = 2;
		int n2 = 1;
		
		int temp = n2;
		n2 = n1;
		n1 = temp;
		
		System.out.print("Variables after swapping:" + n1 + " and " + n2);
		
		
		// Java version
        System.out.println("\nJava Version: " + System.getProperty("java.version"));
        
        // Java runtime version
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        
        // Java home directory
        System.out.println("Java Home: " + System.getProperty("java.home"));
        
        // Java vendor name
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        
        // Java vendor URL
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        
        // Java class path
        System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n"); // What is this
        
        
        
        // Compare two numbers 
        
        int c1 = 25;
        int c2 = 39;
        
       
        if (c1 < c2)
            System.out.println(c1+" < "+c2);
        if (c1 > c2)
            System.out.println(c1+" > "+c2);
        if (c1 == c2)
            System.out.println(c1+" == "+c2);
        if (c1 != c2)
            System.out.println(c1+" != "+c2);
        if (c1 <= c2)
            System.out.println(c1+" <= "+c2);
        if (c1 >= c2)
            System.out.println(c1+" >= "+c2);
		
		
        // Sum of Integer digits
        
        int number = 25;
        
		int sumOfDigits = 0;
		while (number != 0) {
			
			 int digit = number % 10;
			
			 sumOfDigits = sumOfDigits + digit;
			
			number = number/10;
			
		}
		 System.out.println("sum of digits "+ sumOfDigits  );
		
	}
	
}
