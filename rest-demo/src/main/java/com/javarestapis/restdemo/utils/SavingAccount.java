package com.javarestapis.restdemo.utils;

public class SavingAccount implements Account {
	

		@Override
		public void depost(double amount) {
			System.out.print(" Depost in Saving account "+amount);
			
		}

		@Override
		public void withdraw( double amount) {
			System.out.print(" Withdrawal form saving account "+amount);
			
		}

		@Override
		public void calculateInterest() {
			System.out.print("Calculate interest for saving account");
			
		}

		@Override
		public void viewbalance() {
			System.out.print("Your balance saving account");
			
		}
}
