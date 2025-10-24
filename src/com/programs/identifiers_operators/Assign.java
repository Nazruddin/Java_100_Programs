//write a program to demonstrate assignment op

package com.programs.identifiers_operators;

public class Assign {

	public static void main(String[] args) {
		 int num1 = 15;
	        int num2 = 30;
	        int num3 = 5;
	        
	        System.out.println("Initial values: num1 = " + num1 + ", num2 = " + num2 + ", num3 = " + num3);
	        
	        // Basic assignment
	        int result = num1;
	        System.out.println("\nBasic Assignment: result = num1 → " + result);
	        
	        // Compound assignment operators
	        System.out.println("\n--- Compound Assignment Operators ---");
	        num1 += num2;
	        System.out.println("num1 += num2: " + num1);
	        
	        num1 -= num3;
	        System.out.println("num1 -= num3: " + num1);
	        
	        num1 *= 2;
	        System.out.println("num1 *= 2: " + num1);
	        
	        num1 /= 4;
	        System.out.println("num1 /= 4: " + num1);
	        
	        num1 %= 3;
	        System.out.println("num1 %= 3: " + num1);
	        
	        // Increment and Decrement
	        num1 = 5;
	        System.out.println("\n--- Increment/Decrement Operators ---");
	        System.out.println("Initial num1 = " + num1);
	        System.out.println("num1++ : " + (num1++)); 
	        System.out.println("After num1++ : " + num1);
	        System.out.println("++num1 : " + (++num1)); 
	        System.out.println("num1-- : " + (num1--)); 
	        System.out.println("After num1-- : " + num1);
	        System.out.println("--num1 : " + (--num1)); 
	}

}
