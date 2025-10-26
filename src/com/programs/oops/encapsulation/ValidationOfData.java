package com.programs.oops.encapsulation;

class Students{
	 private String rollNo;
	    private String name;
	    private int age;
	    private double marks;
	    private char grade;
	    
	    public Students(String rollNo,String name,int age) {
	    	setRollNo(rollNo);
	    	
	    	setName(name);
	    	setAge(age);
	    }
	    
	    public void setRollNo(String rollNo) {
	    	if(rollNo!=null &&  rollNo.matches("\\d{5}")) {
	    		this.rollNo=rollNo;
	    	}else {
	    		System.out.println("!! Roll number must be exactly 5 digit !!");
	    	}
	    	
	    }
	    public void  setName(String name) {
	    	if(name!=null && name.matches("[a-zA-z ]+")) {
	    		this.name=name;
	    		
	    	}else {
	    		System.out.println("Name not be empty and only contain alphabet");
	    	}
	    	
	    }
	    
	    public void setAge(int age) {
	    	if(age >= 5 && age <= 25) {
	            this.age = age; 
	        } else {
	            System.out.println("Error: Age must be between 5 and 25");
	        }
	    }
	    
	    public String getRollNo() {
	    	return rollNo;
	    }
	    
	    public String getName() {
	    	return name;
	    }
	    
	    public int getAge() {
	    	return age;
	    }
	    
	    public void dispaly() {
	    	System.out.println("Roll No: "+rollNo+" || Name: "+name+" || Age: "+age);
	    	System.out.println();
	    }
	    
}

public class ValidationOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students("00123", "Nazruddin", 22);
		Students s2 = new Students("00113", "Shahzad", 23);
		s1.dispaly();
		s2.dispaly();
	}

}
