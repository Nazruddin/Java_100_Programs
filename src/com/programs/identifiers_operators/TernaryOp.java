//Write a program to find the largest of three numbers using the ternary operators

package com.programs.identifiers_operators;

public class TernaryOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =15;
		int b =18;
		int c = 59;
		
		int max = ( a > b || a > c) ? a : ( b > c ? b :c);
		
		//? (question mark) → means “if the condition is true, do this
		//: (colon) → means “otherwise, do that” (if condition is false)
		
		System.out.println("The largest numer is: "+max);
	}

}
