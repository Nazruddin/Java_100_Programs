package com.programs.oops.abstraction;

interface Vehicle {
    void start();   // abstract method
    void stop();    // abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting with a key ...");
    }

    public void stop() {
        System.out.println("Car is stopping using brake .");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike is starting with a self t...");
    }

    public void stop() {
        System.out.println("Bike is stopping using hand and foot brakes.");
    }
}



public class InterfaceVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v;
		
		v = new Car();
		v.start();
		v.stop();
		
		System.out.println();
		
		v = new Bike();
		v.start();
		v.stop();

	}

}
