package com.programs.control_statement;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 153;
		int temp = no;
		int length = Integer.toString(no).length();
		int sum = 0;
		
		while(no!=0) {
			int digit = no%10;
			sum+=Math.pow(digit, length);
			no/=10;
		}
	
		if (sum == temp) {
			System.out.println(temp + " is an Armstrong number.");
		} else {
			System.out.println(temp + " is not an Armstrong number.");
		}
		
	}

}
