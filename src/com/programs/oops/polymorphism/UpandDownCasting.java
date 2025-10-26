package com.programs.oops.polymorphism;

class Animal{
	void walk(int leg) {
		System.out.println("Animal is walking with "+leg+" legs");
	}
}
class Dog extends Animal{
	void walk(int leg) {
		System.out.println("Dog is walking with "+leg+" legs");
	}
	void bark() {
		System.out.println("Dog is barking...");
	}
}
class Cat extends Animal{
	void walk(int leg) {
		System.out.println("Cat is walking with "+leg+" legs");
	}
	void sound() {
		System.out.println("Cat sound meow meow...");
	}
}

public class UpandDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		
		a1.walk(4);
		a2.walk(4);
		
		if(a1 instanceof Dog) {
			Dog d = (Dog) a1;
			d.bark();
			
		}
		
		if(a2 instanceof Cat) {
			Cat c = (Cat) a2;
			c.sound();
		}
		
		Animal a = new Animal();
		a.walk(4);
		
	}

}
