package com.programs.control_statement;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 151;
		int originalNo = no;
		int reverseNo = 0;
		System.out.println("The Original No is "+originalNo);
		
		while(no!=0) {
			int digit = no%10;
			reverseNo = reverseNo *10+digit;
			no = no/10;
		}
		if(originalNo==reverseNo) {
			System.out.println("The no is "+reverseNo+ " Palindrome");}
		else{
			System.out.println("The no is "+reverseNo+" not a Palindrome");
		}
		}
	}


