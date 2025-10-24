package com.programs.control_statement;

import java.util.Scanner;

public class NthSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth natural number to find sum: ");
		int naturalNo = sc.nextInt();
		
		int initalNo = 1;
		int sum = 0;
		
		while(initalNo<=naturalNo) {
			sum+=initalNo;
			initalNo++;
		}
		System.out.println("The sum of first n natural number is: "+sum);
	}

}
