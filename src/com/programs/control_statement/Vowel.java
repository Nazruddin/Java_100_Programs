package com.programs.control_statement;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter alphabet to check it vowels or consonent...");
		char vowel = sc.next().charAt(0);
		
		switch(vowel) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("The character you enter is "+vowel+" and it's a Vowel");
			break;
			default:
				System.out.println("The character you enter is "+vowel+" and it's a consonants");
			
			
		}
		
	}

}
