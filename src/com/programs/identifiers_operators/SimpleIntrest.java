//Write a program using arithmetic operators to calculate simple interest

package com.programs.identifiers_operators;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter The initial amount of money borrowed or invested. ");
		Scanner s1 = new Scanner(System.in);
		double p = s1.nextDouble();
		System.out.println("The annual interest rate, expressed as a percentage. ");
		Scanner s2 = new Scanner(System.in);
		float i = s2.nextFloat();
		System.out.println("The duration for which the money is borrowed or invested, in years. ");
		Scanner s3 = new Scanner(System.in);
		int y = s3.nextInt();
		
		double simpleIntrest;
		
		simpleIntrest = (p*i*y)/100;
		
		double finalAmount = 0;
		finalAmount=p+simpleIntrest;
		
		System.out.println("The interest earned or paid on the principal amount is "+simpleIntrest+" and final amount is "+finalAmount);
		
	}

}
