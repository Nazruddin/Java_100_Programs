package com.programs.oops.inheritance;

class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Parent class
class Lion extends Animals {
    void walk() {
        System.out.println("Lion is walking");
    }
}

// Child class
class Cat extends Lion {
    void sound() { 
        System.out.println("Cat sound meow meow..");
    }
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.eat();
		c.walk();
		c.sound();
		

	}

}
