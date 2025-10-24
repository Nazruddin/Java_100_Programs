package com.programs.identifiers_operators;

public class Equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 15;
		int b = 18;
		
		System.out.println("\n------Before Swaping the number------------");
		System.out.println("a = "+a+" b = "+b);
		
//		a=a+b;
		a = a + b;
		b = a -b;
		a = a - b;
		
		System.out.println("\n------------After Swaping the number--------------");
		System.out.println("a = "+a+" b = "+b);
	}

}
