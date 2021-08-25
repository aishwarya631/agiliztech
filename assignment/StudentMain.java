package com.at.example.assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.at.example.arraylist.Person1;

public class StudentMain {



public static void main(String[] args) {
	     int choice;

		 Scanner scan=new Scanner(System.in);

        Studentsort s1=new Studentsort("vinay", 3, 45, "A");
        Studentsort s2=new Studentsort("aishwarya", 7, 44, "C");
        Studentsort s3=new Studentsort("bargavi", 4, 66, "B");
    	ArrayList<Studentsort> stud=new ArrayList<>();
  	  stud.add(s1);
  	  stud.add(s2);
  	  stud.add(s3);
  	 // System.out.println(stud);
  	  for(Studentsort a: stud)
  	  {
  		  System.out.println(a);
  	  }
  	  do {
          
         System.out.println("1:sorting id\n2:sorting name\n3:sorting grade\n4:exit");
         System.out.println("enter your choice");
         choice=scan.nextInt();
        switch(choice) {
        case 1:Collections.sort(stud);
        	System.out.println("for sorting id");
                   for(Studentsort i: stud) {
  		                  System.out.println(i.getSid());
  	          }System.out.println("..............................");
                   break;
        case 2: TreeSet<Studentsort> ts=new TreeSet<Studentsort> (new Sortbyname()) ;
        	ts.add(new Studentsort("vinay", 3, 45, "A"));
    		ts.add(new Studentsort("aishwarya", 7, 44, "C"));
    		ts.add(new Studentsort("bargavi", 4, 66, "B"));
    		for(Studentsort a: ts) {
    			
    			System.out.println(a.getSname());
    	   }   
    		System.out.println("..............................");
        case 3:   TreeSet<Studentsort> ts1=new TreeSet<Studentsort>(new Sortbygrade() ) ;
    	ts1.add(new Studentsort("vinay", 3, 45, "A"));
		ts1.add(new Studentsort("aishwarya", 7, 44,"C"));
		ts1.add(new Studentsort("bargavi", 4, 66,"B"));
		for(Studentsort a: ts1) 
			{
				System.out.println(a.getgrade());
			}
		System.out.println("..............................");
		break;
			case 4:System.out.println("invalid");
        }	

}while(true);
  	  
 
}}

	

