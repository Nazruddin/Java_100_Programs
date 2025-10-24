package com.programs.arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {
			10,20,30,40,50	
		};
		int arr2[] = {
			11,22,33,44,55
		};
		
		
		
	 int merge[] = new int[ arr1.length+arr2.length];
	 
	 for(int i =0;i<arr1.length;i++) {
		 merge[i] = arr1[i];
	 }
	 for(int i = 0; i<arr2.length; i++) {
		 merge[arr1.length+i] = arr2[i];
	 }
	 System.out.println("The Merge of two array are :");
	 for(int num:merge) {
		 System.out.print(num+" ");
	 }
	}

}
