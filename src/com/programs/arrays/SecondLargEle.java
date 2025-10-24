package com.programs.arrays;

import java.util.Scanner;

public class SecondLargEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
			10,20,50,40,80,60	
		};
		
		int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;  // previous largest becomes second
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
	}

}
