package com.programs.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
			10,52,41,8,520,4	
		};
		
		
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
			
		}
		System.out.println("Reverse Array: ");
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}
