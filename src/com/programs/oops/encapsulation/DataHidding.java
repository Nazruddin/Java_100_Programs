package com.programs.oops.encapsulation;

class BankAccount{
	private double balance;
	private String accountNumber;
	private String password;
	
	public BankAccount(String accountNumber,double intailaBalance) {
		this.accountNumber = accountNumber;
		if(intailaBalance>=0) {
			this.balance=intailaBalance;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return "XXXXXX"+accountNumber.substring(accountNumber.length()-4);
	}
	
	public void deposite(double amount) {
		if(amount>0) {
			balance+=amount;
			System.out.println("Deposit amount : "+ amount);
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdraw amount: "+amount);
		}else {
			System.out.println("Insufficient balance or Invalid amount");
		}
	}
	
	
}

public class DataHidding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account = new BankAccount("5241026457", 5000);
		
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Balance: "+account.getBalance());
		
		account.deposite(10000);
		account.withdraw(12000);
		
		System.out.println("Balance amount after withdrawal : "+account.getBalance());
		
	}

}
