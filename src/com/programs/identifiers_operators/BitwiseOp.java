//Write a program to check whether a number is even or odd using bitwise op

package com.programs.identifiers_operators;

import java.util.Scanner;

public class BitwiseOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Using bitwise AND operator
        if ((num & 1) == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
	}

}
