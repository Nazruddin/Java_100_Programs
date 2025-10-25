package com.programs.oops.intro;

public class MultipleObj {
	
	String name;
	String city;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleObj obj1 = new MultipleObj();
		obj1.name = "Harsh";
		obj1.city = "Kurla";
		
		MultipleObj obj2 = new MultipleObj();
		obj2.name = "Amit";
		obj2.city = "Goregoan";
		
		
		MultipleObj obj3 = new MultipleObj();
		obj3.name = "Vishal";
		obj3.city = "Bhiwandi";
		
		System.out.println("Name: "+obj1.name+ " City: "+obj1.city);
		System.out.println("Name: "+obj2.name+ " City: "+obj2.city);
		System.out.println("Name: "+obj3.name+ " City: "+obj3.city);
		
		
	}

}
