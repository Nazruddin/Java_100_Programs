package com.programs.arrays;

public class CountNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
				20,54,98,52,63,456,20,14,652,7,3,369
		};
		int evenCount = 0;
		int oddCount = 0;
		
		for(int num:arr) {
			if(num%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Total Count of an Even number: "+evenCount);
		System.out.println("Total Count of an Odd number: "+oddCount);
	}

}
