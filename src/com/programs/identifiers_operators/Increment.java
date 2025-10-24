//Write a program to demonstrate pre and post increment operators

package com.programs.identifiers_operators;

import java.util.Scanner;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int no = sc.nextInt();
		
		System.out.println("-------pre-increment-------");
		
		System.out.println("Number before pre-increment: "+no);
		
		System.out.println("Number After pre-increment: "+(++no));
		
		System.out.println("\n-------post-increment-------");
		System.out.println("Number before post-increment: "+no);
		System.out.println("NUmber during post-increment: "+(no++));
		
		System.out.println("Number After post-increment: "+no);
	
	}

}
