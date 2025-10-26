package com.programs.oops.abstraction;

interface Vehicles {
    void start();
    void stop();
}


interface ElectricVehicle extends Vehicles {
    void charge();
}


class ElectricCar implements ElectricVehicle{
	public void start() {
		System.out.println("Electric car is Starting... ");
	}
	public void charge() {
		System.out.println("Pluggedin for charging");
	}
	public void stop() {
		System.out.println("Electric Car is stoping...");
	}
}


public class InterfaceInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricCar e = new ElectricCar();
		e.start();
		e.charge();
		e.stop();
	}

}
