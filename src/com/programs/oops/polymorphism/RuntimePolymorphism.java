package com.programs.oops.polymorphism;

class Vehicles{
	void start() {
		System.out.println("Vehicle is Starting....");
	}
	void stop() {
		System.out.println("Vehicle is Stoping...");
	}
}

class Bike extends Vehicles{
	void start() {
		System.out.println("Bike is Starting....");
	}
	void stop() {
		System.out.println("Bike is Stoping...");
	}
}

class Car extends Vehicles{
	void start() {
		System.out.println("Car is Starting....");
	}
	void stop() {
		System.out.println("Car is Stoping...");
	}
}

public class RuntimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicles veh1 = new Vehicles();
		Vehicles veh2 = new Bike();
		Vehicles veh3 = new Car();
		
		veh1.start();
		veh1.stop();
		System.out.println();
		
		veh2.start();
		veh2.stop();
		System.out.println();
		
		veh3.start();
		veh3.stop();
		System.out.println();
		
		
	}

}
