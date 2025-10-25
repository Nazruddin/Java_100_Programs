package com.programs.oops.intro;

public class Calculator {
	
	static int num1 = 100;
	static int num2 = 12;
	
	int addition(int a,int b) {
		return a+b;
	}
	int substraction(int a,int b) {
		return a-b;
	}
	int multiplication(int a,int b) {
		return a*b;
	}
	float division(float a,float b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int sum = calc.addition(num1, num2);
		int sub = calc.substraction(num1, num2);
		int mult = calc.multiplication(num1, num2);
		float div = calc.division(num1, num2);
		
		System.out.println("The Addition of "+num1+" and "+num2+" is " +sum);
		System.out.println("The Substraction of "+num1+" and "+num2+" is " +sub);
		System.out.println("The Multiplication of "+num1+" and "+num2+" is " +mult);
		System.out.println("The Division of "+num1+" and "+num2+" is " +div);
	}
	
}
