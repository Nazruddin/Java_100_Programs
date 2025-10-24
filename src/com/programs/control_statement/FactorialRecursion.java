package com.programs.control_statement;

import java.util.Scanner;

public class FactorialRecursion {
	
	 // Recursive method to find factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) {   // base condition
            return 1;
        } else {
            return n * factorial(n - 1);   // recursive call
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factorial: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
	}

}
