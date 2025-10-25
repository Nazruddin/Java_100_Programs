package com.programs.oops.inheritance;

class A{
	void m1() {
		System.out.println("Class A method m1() is calling");
	}
}

class B extends A{
	void m1() {
		System.out.println("Class B method m1() is calling");
	}
}

public class MethodOverridingEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		b.m1();
		
		A a = new B();
		a.m1();
	}

}
