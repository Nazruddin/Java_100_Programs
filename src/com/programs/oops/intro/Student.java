package com.programs.oops.intro;

public class Student {
	String name ;
	int roll_no ;
	int marks ;
	
	public static void main(String[] args) {
	
		Student s = new Student();
		s.name = "Nazruddin Shaikh";
		s.roll_no = 25;
		s.marks = 98;
		System.out.println(s.name+" is a Student whose roll no is "+s.roll_no+" And he secure "+s.marks+" out of 100");
	}
}
