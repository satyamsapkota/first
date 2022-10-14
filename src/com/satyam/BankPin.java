package com.satyam;

import java.util.Scanner;

public class BankPin {

	static int Pin = 1234;
	static double bankBalance = 1200;

	public static void  main( String[] args ) {
	
	
	System.out.println("WELCOME TO THE BANK.");
	System.out.print("ENTER YOUR PIN: ");
		
		
    Scanner scanner = new Scanner(System.in);
	int pin = scanner.nextInt();
			
	if (Pin==pin) {System.out.println("Cash withdraw <CW> |  Cash Deposite <CD> |  Balance Enquiry <BE>");
		
	else {
		System.out.println("");
	}
	
	
	
			
	}

	public static void balanceEnquiry() {
		System.out.println("Balance in your account is: " + bankBalance + "USD");
	}

	public static void cashDeposite(double depositedAmount) {

		bankBalance = bankBalance + depositedAmount;

	}

	public static void withdrawBalance(double withDrawBalance) {
		initialAmount = initialAmount - withDrawBalance;

	}

}
