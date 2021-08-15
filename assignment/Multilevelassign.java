package com.at.example.assignment;

class Person {
	String name = "aishwarya";

	public Person() {

		System.out.println("inside person");
	}

	void display1() {
		System.out.println("person name: " + name);
	}
}

class Employee1 extends Person {
	String name = "abc";
	int emp_id = 1, salary = 80000, bonus = 2000;

	public Employee1() {
		this(100);
		System.out.println("inside employee");

	}

	public Employee1(int a) {

		System.out.println("second constructor" + a);

	}

	void total() {

		System.out.println("employee name: " + name);
		int total = salary + bonus;
		System.out.println("total salary of employee: " + total);
		System.out.println(" employe id: " + emp_id);
		System.out.println("............................");
	}
}

class Manager1 extends Employee1 {
	String companyname = "agiliz";
	int m_id = 123, salary = 25000;

	void display() {
		System.out.println("manager comapany name: " + companyname);
		System.out.println("manager id: " + m_id);
		System.out.println(" salary: " + salary);
		System.out.println(".....................................");
	}

}

public class Multilevelassign {

	public static void main(String[] args) {

		Manager1 m1 = new Manager1();
		m1.display1();
		m1.total();
		m1.display();

	}

}
