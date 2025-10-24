package com.programs.control_statement;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNo = 15427;
		int reverseNo = 0;
		System.out.println("The Original No is "+originalNo);
		
		while(originalNo!=0) {
			int digit = originalNo%10;
			reverseNo = reverseNo *10+digit;
			originalNo = originalNo/10;
		}
		System.out.println("The Reverse No is: "+reverseNo);
	}

}
