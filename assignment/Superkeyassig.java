package com.at.example.assignment;

class First{
	
	void show1()
	{
		 System.out.println(" parent class method");
	}
	public First(int n1){
		System.out.println("inside"+n1);
	}
	}

class Second extends First{
	public Second() {
		super(10);
		System.out.println("value of");
	}
	
	public Second(int a){
		this();
		//this.show();
	
		super.show1();
		System.out.println("single param");
		this.show1();
		
	}
		
	void show()
	{
		System.out.println("inside child class method");
	}
	
	 
	
}

public class Superkeyassig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s1=new Second(1);
		
		
		
		
		
		
		
		

	}

}
