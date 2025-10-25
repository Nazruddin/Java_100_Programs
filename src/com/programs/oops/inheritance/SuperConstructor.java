package com.programs.oops.inheritance;

class Parent{
	Parent() {
		System.out.println("Parent class's method calling");
	}
}

class Child extends Parent{
	
	Child() {
		super();
		System.out.println("Child class's method calling");
	}
}


public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		
		

	}

}
