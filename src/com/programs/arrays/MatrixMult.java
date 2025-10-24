package com.programs.arrays;

public class MatrixMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat1[][] = {
				{1,2,3 },
				{4,5,6 },
				{7,8,9 }
		};
		int mat2[][] = {
				{1,2,3 },
				{4,5,6 },
				{7,8,9 }
		};
		
		int rows = mat1.length;
		int cols = mat1[0].length;
		
		int matrixAdd[][] = new int[3][3];
		
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrixAdd[i][j] =0 ;
				for(int k=0;k<cols;k++) {
					matrixAdd[i][j] +=  mat1[i][k] * mat2[k][j];
				}
			}
		}
		for(int i=0; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(matrixAdd[i][j] +" ");
			}
			System.out.println();
		}
	}

}
