package com.programs.arrays;

public class CommonEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {
			5,10,15,20,25,30,35,40,45,50,50
		};
		int arr2[] = {
			10,20,30,40,50,60,70,80,5,25
		};
		
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					System.out.println(arr1[i]);
//				}
//			}
//		}
		
		System.out.println("Common element between two array are: ");
		
		 // Check if arr1[i] appeared earlier in arr1
		for(int i=0;i<arr1.length;i++) {
			boolean alreadyPrinted = false;
			for(int j =0;j<i;j++) {
				if(arr1[i]==arr1[j]) {
					alreadyPrinted = true;
					break;
				}
				
			}
			  // Skip if already printed
			if(alreadyPrinted) {
				continue;
			}
			
		     // Check if arr1[i] exists in arr2
			for(int k =0;k<arr2.length;k++) {
				if(arr1[i]==arr2[k]) {
					System.out.print(arr1[i]+" ");
					break;
				}
			}
		}
	}

}
