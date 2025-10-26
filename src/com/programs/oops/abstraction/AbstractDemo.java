package com.programs.oops.abstraction;

abstract class Demo{
	 Demo(){
		System.out.println("Demo Constructor");
	}
	
	void concrete() {
		System.out.println("Concrete method od demo class");
	}
}

class Usage extends Demo{
	
}



public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Usage();
		d.concrete();
	}

}
