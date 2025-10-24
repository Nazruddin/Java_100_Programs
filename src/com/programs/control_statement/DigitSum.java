package com.programs.control_statement;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1027;
		int originalNo = num;
		int sum =0;
		
		while(num!=0) {
			int digit = num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("The sum of all digit("+originalNo+") is "+sum);
	}

}
