package com.programs.control_statement;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter year to check it's leap year or not");
		int year = s.nextInt();
		
		if(year%4==0) {
			System.out.println(year+" is a leap year");
		}else {
			System.out.println(year+ "is not a lea year");
		}

	}

}
