package com.programs.oops.encapsulation;

class Student{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age=age;
		}else {
			System.out.println("Invalid age");
		}
	}
	
	public void getName() {
		System.out.println("Name: "+name);
	}
	public void getAge() {
		System.out.println("Age: "+age);
	}
	
}

public class DemostarteEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setName("Nazruddin Shaikh");
		s.setAge(22);
		
		s.getName();
		s.getAge();
		System.out.println();
		
		s.setName("Shahzad");
		s.setAge(23);
		
		s.getName();
		s.getAge();
		
		
	}

}
