package com.programs.arrays;


public class Transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {
				{5,4},
				{2,1},
				{7,9}
		};
		
		int row = arr.length;
		int col = arr[0].length;
		int temp[][] = new  int[col][row];
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				temp[j][i] = arr[i][j];
			}
		}
		
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}

}
