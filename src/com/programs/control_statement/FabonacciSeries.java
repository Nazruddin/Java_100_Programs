package com.programs.control_statement;



public class FabonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =10;
		int first =0;
		int second =1;
		int next ;
		System.out.println(first);
		System.out.println(second);
		
		for(int i =2; i<count;i++) {
			next = first+second;
			
			first = second;
			second = next;
			
			System.out.println(next);
		}
		
	}

}
