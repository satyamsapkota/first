package com.satyam;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {

		System.out.println("Hello Cal;culation");

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the first number: ");

		int num1 = scan.nextInt();
		System.out.print("Enter the second number: ");

		int num2 = scan.nextInt();
		System.out.println("Addition<Add>/Subraction<Sub>/Multiplication<Mult>/Division<Div >/");

		String option = scan.next();

		if (option.equals("Add")) {
			add(num1, num2);
		} else if (option.equals("Sub")) {
			sub(num1, num2);
		} else if (option.equals("Mult")) {
			mult(num1, num2);
		} else if (option.equals("Div")) {
			div(num1, num2);
		}
	}

	public static void add(float num1, float num2) {

		System.out.println("addition of two numbers is " + (num1 + num2));

	}

	public static void sub(float num1, float num2) {
		System.out.println("addition of two numbers is " + (num1 - num2));
	}

	public static void mult(float num1, float num2) {
		System.out.println("addition of two numbers is " + (num1 * num2));
	}

	public static void div(float num1, float num2) {
		System.out.println("addition of two numbers is " + (num1 / num2));
	}
}
