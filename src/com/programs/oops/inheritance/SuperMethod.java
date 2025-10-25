package com.programs.oops.inheritance;

class Planet{
	void showMsg() {
		System.out.println("Planet's method executed");
	}
}

class Earth extends Planet{
	
	void showMsg() {
		System.out.println("Earth's method executed");
	}
	void display() {
		super.showMsg();
		this.showMsg();
	}
}



public class SuperMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Earth e = new Earth();
		e.display();

	}

}
