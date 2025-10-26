package com.programs.oops.abstraction;

import java.util.Scanner;

abstract class Shape{
	abstract void area();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void area() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    void area() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}


public class AbsractMethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		double rad = sc.nextDouble();
		Shape c = new Circle(rad);
		c.area();
		
		System.out.println("Enter lenght and width of Rectangle");
		int l = sc.nextInt();
		int w = sc.nextInt();
		Shape r = new Rectangle(l,w);
		r.area();
		
		System.out.println("Enter height and base of Triangle");
		int h = sc.nextInt();
		int b = sc.nextInt();
		Shape t = new Rectangle(h,b);
		t.area();
		
		
	}

}
