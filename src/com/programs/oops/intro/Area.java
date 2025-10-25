package com.programs.oops.intro;

public class Area {
	
	float radius;
	final double pi = 3.14;
	int length;
	int width;
	float base;
	
	
	double getArea(float radius ) {
		this.radius=radius;
		return radius*radius*pi;
	}
	
	int getArea(int length,int width) {
		this.length=length;
		this.width=width;
		return length*width;
	}
	
	double getArea(float base,int width ) {
		this.base=base;
		this.width=width;
		return 0.5*(base*width);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Area a = new Area();

	        System.out.println("Area of Circle: " + a.getArea(5.5f));
	        System.out.println("Area of Rectangle: " + a.getArea(10, 20));
	        System.out.println("Area of Triangle: " + a.getArea(8.5f, 10));

	}

}
