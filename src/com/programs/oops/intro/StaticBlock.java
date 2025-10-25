package com.programs.oops.intro;

public class StaticBlock {
	
	{
		System.out.println("Non-Static Block executing");
	}
	
	static {
		System.out.println("Static Block execution");
	}
	
	public StaticBlock() {
        System.out.println("Constructor executed.");
    }
	
	public static void main(String[] args) {
        System.out.println("Main method started.");
        StaticBlock obj = new StaticBlock();
        System.out.println("Main method ended.");
	}

}
