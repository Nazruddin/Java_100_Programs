//write a program to swap two no without using third  variable (use arithmetic op)

package com.programs.identifiers_operators;

import java.util.Scanner;

public class Swap {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before Swaping");
		System.out.println("Enter interger value of First Variable");
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		System.out.println("Enter interger value of Second Variable");
		Scanner s2 = new Scanner(System.in);
		int b = s2.nextInt();
		

		
		a = a+b;
		b = a-b;
		a=a-b;
		
		System.out.println(" After Swaping First Variable = "+a+" Second Variable = "+b);
		
		
	}

}
