package com.programs.oops.intro;

public class EmployeeSal {
	
	double basicSal;
	int allowence;
	float tax;
	double netSal;
	
	public   EmployeeSal(double basicSal,int allowence,float tax) {
		// TODO Auto-generated constructor stub
		this.basicSal = basicSal;
		this.allowence = allowence;
		this.tax = tax;
		
		
		
		this.netSal = basicSal+allowence-tax;
	}
	
	void display(){
		System.out.println("The salary of an Employee is : "+netSal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeSal emp = new EmployeeSal(25000,5000,3500);
		emp.display();
	}

}
