package com.at.example.assignment;

class Student1
{
	int id,age,cgpa;
	String name;
	
	Student1()
	{
		System.out.println("default ");
		
	}
	Student1(String name)
	{
		this();
		this.name=name;
		System.out.println("student name is "+this.name);
		
	}
		
	Student1(int id,String name,int cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		System.out.println("student id,name and cgpa are  "+this.id+" "+this.name+"  "+cgpa);
	}
	

}


public class Studthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s2=new Student1("vinay");
		Student1 s4=new Student1(10,"abc",98);
		

	}

	}


