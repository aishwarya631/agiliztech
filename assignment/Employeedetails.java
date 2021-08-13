package com.at.example.assignment;


class Employee
{
	int salary=20000;
	String department="BMS College";
	void role()
	{
		System.out.println("employee ");
	}
}

class Manager extends Employee
{
	int bonus=10000;
	void role()
	{
		System.out.println("Role is Manager ");
	}
}

class HR extends Employee
{
	int bonus=5000;
	void role()
	{
		System.out.println("Role is HR ");
	}}

class Developer extends Employee
{
	int bonus=8000;
	void role()
	{
		System.out.println("Role is Developer ");
	}
}



public class Employeedetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee();
		e1.role();
		
		Manager m1=new Manager();
		m1.role();
		
		HR h1=new HR();
		h1.role();
		
		System.out.println("Bonus of manager is "+m1.bonus);
		System.out.println("Bonus of HR is "+h1.bonus);
		System.out.println("-----------");
		
		Developer d1=new Developer();
		d1.role();
		System.out.println("Bonus of Developer is "+d1.bonus);

	}


	}
	
	


