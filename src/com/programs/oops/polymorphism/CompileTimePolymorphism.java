package com.programs.oops.polymorphism;

class Vehicle{
	void wheel(int wheel){
		System.out.println("Vehicle has "+wheel+" wheels to run on road.");
	}
	
	 void wheel(int wheel, String vehicleType) {
	        System.out.println(vehicleType + " has " + wheel + " wheels to run on road.");
	    }
	 
	 void wheel(int wheel, int doorCount,String vehicalType) {
	        System.out.println(vehicalType+" has " + wheel + " wheels and " + doorCount + " doors.");
	    }
}



public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.wheel(4);
		vehicle.wheel(10, "Truck");
		vehicle.wheel(4,4,"Car");
	}

}
