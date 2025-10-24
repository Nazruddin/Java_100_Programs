package com.programs.arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {
				15,14,78,25,65,15,78,29,14	
			};
		
		System.out.println("Array after removing duplicates: ");
		
		for(int i=0; i<arr.length;i++) {
			boolean isDuplicate = false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(arr[i]+" ");
			}
		}
			
	}

}
