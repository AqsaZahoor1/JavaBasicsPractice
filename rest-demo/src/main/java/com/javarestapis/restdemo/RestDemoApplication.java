
package com.javarestapis.restdemo;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.javarestapis.restdemo.utils.Account;
import com.javarestapis.restdemo.utils.Bank;
import com.javarestapis.restdemo.utils.CurrentAccount;

@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
		
	
 
		
//		Animals dog = new Dog();
//		
		Bank b = new Bank();
		
		
		Account currAcc = new CurrentAccount();
		currAcc.depost(100);
		
		b.addAccount(currAcc);
		
		
	}
	
}
