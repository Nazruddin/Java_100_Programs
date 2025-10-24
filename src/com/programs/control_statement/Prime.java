package com.programs.control_statement;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean isPrime = false;
		
		if(n==0 || n==1) {
			isPrime = true;
		}
		
		for(int i =2; i<=n/2; i++) {
			if(n%i==0) {
				isPrime = true;
				break;
			}
		}
		if(!isPrime) {
			System.out.println("It is prime no");
		}else {
			System.out.println("Its not a prime");
		}

	}

}
