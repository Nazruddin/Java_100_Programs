package com.programs.oops.inheritance;

class Electronics {
    void powerOn() {
        System.out.println("Electronics device is powered on");
    }
}


class Mobile extends Electronics {
    void makeCall() {
        System.out.println("Mobile is making a call");
    }
}


class Laptop extends Electronics {
    void code() {
        System.out.println("Laptop is coding");
    }
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m = new Mobile();
		m.makeCall();
		m.powerOn();
		
		System.out.println();
		
		Laptop l = new Laptop();
		l.code();
		l.powerOn();
		

	}

}
