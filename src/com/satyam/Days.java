package com.satyam;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {

		Scanner userinput = new Scanner(System.in);
		
		
		System.out.println("Enter the Number :");
		
		int daysNumber = userinput.nextInt();
		
		switch (daysNumber) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Firday");
			break;
		case 6:
			System.out.println("Saturady");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println(daysNumber + " Day does not Existed!!");
			break;
		}
		 
	}
}

