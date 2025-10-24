//Write a program to demonstrate valid and invalid java identifier

package com.programs.identifiers_operators;

import java.util.Scanner;

public class ValidationOfIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Asking the user to enter a name to check
		System.out.println("Please type name which you want as a identifier");
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();

		boolean isValid = true;   // flag to check if identifier is valid
		
		// 1️⃣ Check if the first character is a digit
		char firstIndex = user.charAt(0);
		if (firstIndex >= '0' && firstIndex <= '9') {
			System.out.println("It is not a identifier bcz first index " + firstIndex + " is a digit part");
			isValid = false;
		}
		
		// 2️⃣ Check for invalid characters in the identifier

		for (char symbol : user.toCharArray()) {
			if (!((symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z')
					|| (symbol >= '0' && symbol <= '9') || symbol == '_' || symbol == '$')) {
				System.out.println("❌ Invalid: Contains illegal symbol '" + symbol + "'");
				isValid = false;
				break;

			}
		}
		// 3️⃣ Check if input matches any Java keyword

		boolean iskeyword = false;
		String[] key = { "int", "char", "double", "float", "final" };

		for (int i = 0; i < key.length; i++) {
			if (user.equals(key[i])) {
				iskeyword = true;
				break;
			}
		}

		if (iskeyword) {
			System.out.println("Error! You are using a Java keyword as an identifier");
		}
		
		
		// 4️⃣ Final decision based on checks above
		
		if (isValid && !iskeyword) {
			System.out.println("✅ '" + user + "' is a valid Java identifier.");
		} else {
			System.out.println("⚠️ '" + user + "' is NOT a valid Java identifier.");
		}

	}
}
