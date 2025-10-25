package com.programs.oops.inheritance;

class Bank {
    String bankName = "Reserve Bank Of India";
}


class SavingsAccount extends Bank {
    String bankName = "State Bank Of India";

    void displayBankNames() {
        System.out.println("Child's bank name: " + bankName);        // accesses child's variable
        System.out.println("Parent's bank name: " + super.bankName); // accesses parent's variable using super
    }
}

public class SuperVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount s = new SavingsAccount();
		s.displayBankNames();
	}

}
