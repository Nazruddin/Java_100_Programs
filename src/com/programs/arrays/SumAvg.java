package com.programs.arrays;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter " +size+" Element");
		for(int i=0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int sum = 0;
		int avg = 0;
		
		for(int arr2:arr) {
			sum+=arr2;
		}
		
		avg=sum/size;
		
		System.out.println("The sum of all element is: "+sum);
		System.out.println("The Average of an element is: "+avg);
	}

}
