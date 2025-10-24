package com.programs.arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
				15,14,78,25,65,15,78,29,14	
			};
		int count = 0;
		
		System.out.println("Duplicate elements in the array are:");
		
		for(int i =0;i<=arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					
				System.out.println(arr[i]);
				count++;
				break;
				
					
				}
				
			}
		}

			System.out.println("Duplicate: "+count);
	}

}
