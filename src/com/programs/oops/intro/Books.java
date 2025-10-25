//Constructor Overloading

package com.programs.oops.intro;

public class Books {
	String title;
	String author;
	int price;
	
	public  Books() {
		this("untitle","unknown",0);
	}
	
	public Books(String title, String author) {
		this(title,author,0);
	}
	public Books(String title, String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	void display() {
		System.out.println("Book Title: "+title+"  Author of Book: "+author+" The price of the Books is: $"+price);
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Books b1 = new Books();
		Books b2 = new Books("Alice's Adventures in Wonderland"," Lewis Carroll");
		Books b3 = new Books("Treasure Island", " Robert Louis Stevenson",2500);
		
		b1.display();
		
		b2.display();
		b3.display();
		
		
	}
}
