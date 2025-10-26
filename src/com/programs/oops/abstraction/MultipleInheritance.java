package com.programs.oops.abstraction;

interface Callable {
    void makeCall();
}

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone  implements Callable, Camera, MusicPlayer {
    public void makeCall() {
        System.out.println(" Calling a contact...");
    }

    public void takePhoto() {
        System.out.println("Taking a photo with rear camera...");
    }

    public void playMusic() {
        System.out.println(" Playing your favorite song...");
    }
}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone();
        phone.makeCall();
        phone.takePhoto();
        phone.playMusic();
	}

}
