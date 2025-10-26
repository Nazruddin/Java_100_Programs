package com.programs.oops.polymorphism;

class Shape{
	void Area() {
		System.out.println("The area of  Shape:");
	}
	
}

class Circle extends Shape{
	
double radius;

	 Circle(double radius) {
		this.radius = radius;
	}
	 
	 void Area() {
		 double area = Math.PI*radius*radius;
		 System.out.println("Area of  Circle is: "+area);
	 }
}

class Rectangle extends Shape{
	int length;
	int width;
	
	 Rectangle(int length,int width) {
		// TODO Auto-generated constructor stub
		 this.length=length;
		 this.width=width;
	}
	 
	 void Area() {
		 int area = length*width;
		 System.out.println("Area of Rectangle is: "+area);
	 }
}

class Triangle extends Shape{
	int height;
	int base;
	
	 Triangle(int height,int base) {
		// TODO Auto-generated constructor stub
		 this.height=height;
		 this.base=base;
	}
	 
	 void Area() {
		 double area = 0.5*height*base;
		 System.out.println("Area of Triangle is: "+area);
	 }
}

public class CalculateArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Circle(10.5);
		Shape s2 = new Rectangle(50, 10);
		Shape s3 = new Triangle(20, 6);
		
		s1.Area();
		s2.Area();
		s3.Area();
		

	}

}
