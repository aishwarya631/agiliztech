package com.at.example.assignment;

import java.util.Scanner;

public class Equalsstringassig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println(" enter second string");
		String str2=sc.nextLine();
		/*String str1 = "Java Techie";
		String str2 = "Python Techie";*/
		// String str3=str1;
		if (str1.equals(str2)) {
			System.out.println("Strings are equal ");
			System.out.println(str1.equals(str2));
		} else {
			System.out.println("strings are not equal ");
			System.out.println(str1.equals(str2));
		}

	}

}


