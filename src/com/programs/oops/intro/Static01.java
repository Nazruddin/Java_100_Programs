//use of static variable and method

package com.programs.oops.intro;

public class Static01 {
	
	static float radius ;
	static final double pi = 3.14;
	
	static double cricleArea(float radius) {
		Static01.radius=radius;
		return pi*radius*radius;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static01 s = new Static01();
		System.out.println("The area of Circle is: "+Static01.cricleArea(3.5f));
	}

}
