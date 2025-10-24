package com.programs.control_statement;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First no");
		int firstNo = sc.nextInt();
		System.out.println("Enter Second no");
		int secondNo = sc.nextInt();
		System.out.println("Enter Third no");
		int thirdNo = sc.nextInt();
		
		if(firstNo>=secondNo && firstNo>=thirdNo) {
			System.out.println("First number "+firstNo+" is greater than " +secondNo+" and "+thirdNo );
		}else if(secondNo>=firstNo && secondNo>=thirdNo) {
			System.out.println("Second number "+secondNo +" is greater than "+firstNo+" and "+thirdNo );
		}else{
			System.out.println("Third number "+thirdNo+" is greater than " +firstNo+" and "+secondNo );
		}
	}

}
