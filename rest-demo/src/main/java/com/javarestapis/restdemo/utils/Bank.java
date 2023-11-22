package com.javarestapis.restdemo.utils;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	
	private List accountsList; 

	public Bank() {
		
		this.accountsList = new ArrayList<String>();
	}

	public List getAccountsList() {
		return accountsList;
	}

	// add account
	public void addAccount(Account account) {
		accountsList.add(account);
	}

	// remove account
	public void removeAccount(Account account) {
		accountsList.remove(account);
	}
	
	public void depostInAccount(Account account , double amount) {
		account.depost(amount);
	}



}
