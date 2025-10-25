//call another constructor using this() 

package com.programs.oops.intro;

public class Demo01 {
	
	 Demo01() {
	         this("Hello");// calls Constructor 2
	        System.out.println("Constructor 1 executed");
	    }
	 Demo01(String txt) {
	        System.out.println("Constructor 2 executed: " + txt);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo01 obj = new Demo01();
	}

}
