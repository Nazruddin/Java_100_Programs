package com.programs.control_statement;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1542344;
		int evenCount = 0;
		int oddCount = 0;
		
		while(no!=0) {
			int digit=no%10;
			if(digit%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			no/=10;
		}
		System.out.println("There are "+evenCount+" Even no present in the given number");
		System.out.println("There are "+oddCount+" Odd no present in the given number");
	}

}
