package com.programs.arrays;

public class LargeEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
			10,25,41,85,62,44,265,32,7	
		};
		int large = arr[0];
		
		for(int arr2:arr) {
			if(arr2>large) {
				large = arr2;
			}
		}
		System.out.println("The largest element of an array is: "+large);
	}

}
