//Dynamic Method Dispatch is a mechanism in Java where the call to an overridden method is resolved at runtime rather than compile-time.

package com.programs.oops.inheritance;

class Animilia {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dogs extends Animilia {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cats extends Animilia {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class DynamicMethodDispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animilia myAnimal;
		
		myAnimal = new Dogs();
		myAnimal.sound();
		System.out.println();
		
		myAnimal = new Cats();
		myAnimal.sound();
		
		System.out.println();
		myAnimal = new Animilia();
		myAnimal.sound();

	}

}
