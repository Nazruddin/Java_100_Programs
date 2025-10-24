package com.programs.arrays;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
			10,7,05,15,1250,415,1	
		};
		
		for(int i =0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Array in asceding order...");
		for(int num:arr) {
			System.out.print(num+ " ");
		}
	}

}
