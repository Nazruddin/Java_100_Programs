package com.programs.oops.inheritance;

class BankAccount{
	final String bankName = "Bank of Baroda"; 
	
	final void displaybank() {
		System.out.println("Bank name: " + bankName);
	}
}

class SavingAccounts extends BankAccount{
	
	// void displayBank() {
    //     System.out.println("This is child method");
    // }  // Trying to override final method will give error

	
	void accountType() {
		System.out.println("This is a Saving Account");
	}
}

final class FD{
	void displayFD() {
		System.out.println("This is a FD Account");
	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingAccounts sav = new SavingAccounts();
		sav.displaybank();
		sav.accountType();
		FD fd = new FD();
		fd.displayFD();
		
	}

}
