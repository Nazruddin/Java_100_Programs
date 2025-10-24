//Write a program to demonstrate logical AND, OR, and NOT op

package com.programs.identifiers_operators;

import java.util.Scanner;

public class LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Are you indian citizen");
		boolean iscitizen = sc.nextBoolean();
		System.out.println("Have you any Disability??");
		boolean isDisable = sc.nextBoolean();
		
	System.out.println("ENter your income");
	double income = sc.nextDouble();
	
	System.out.println("You have any criminal case");
	boolean isCrimal = sc.nextBoolean();
	
	boolean eligible = (iscitizen && age > 18 && (income<50000) || isDisable && !isCrimal);
	
	if(eligible) {
		System.out.println("You are Eligible to avail Govt. scheme");
	}else {
		System.out.println("You are  not Eligible to avail Govt. scheme");
	}
		
	sc.close();
	
	}

}
