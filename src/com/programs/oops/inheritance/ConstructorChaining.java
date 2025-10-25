package com.programs.oops.inheritance;

class Vehicle {
    String type;
    int wheels;
    
   
    Vehicle() {
        this("Car", 4); 
        System.out.println("Vehicle() called");
    }
    

    Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
        System.out.println("Vehicle(with para) called");
    }
    
    void display() {
        System.out.println("Type: " + type + ", Wheels: " + wheels);
    }
}

class Car extends Vehicle {
    String brand;
    

    Car() {
        super(); 
        this.brand = "Unknown";
        System.out.println("Car() called");
    }
    
    
    Car(String brand) {
        super("Car", 4); 
        this.brand = brand;
        System.out.println("Car(with para) called");
    }
    
    void display() {
        super.display();
        System.out.println("Brand: " + brand);
    }
}


public class ConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.display();
		
		System.out.println();
		Car car2 = new Car("Suzuki");
		car2.display();
		
		System.out.println();
		Vehicle v1 = new Vehicle();
		v1.display();
		
		System.out.println();
		Vehicle v2 = new Vehicle("Swift",4);
		v2.display();
		
		
		
		
	}

}
