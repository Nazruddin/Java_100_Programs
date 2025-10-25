package com.programs.oops.intro;

public class StudentInfo {
	String name;
    int age;

    // Default constructor
    StudentInfo() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    StudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
        System.out.println();
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo s1 = new StudentInfo();
        s1.display();

        // Using parameterized constructor
        StudentInfo s2 = new StudentInfo("Amit", 20);
        s2.display();
	    
	}

}
