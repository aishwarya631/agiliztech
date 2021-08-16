package com.at.example.assignment;
import java.util.Scanner;

public class Countingvowels {

	public static void main(String[] args) {
		String line;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the string : ");
		line = sc.nextLine();
		int vow = 0, consonants = 0, dig = 0, spac = 0, symbols = 0;

		line = line.toLowerCase();
		for (int i = 0; i < line.length(); ++i) {
			char ch = line.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				++vow;
			} else if ((ch >= 'a' && ch <= 'z')) {
				++consonants;
			} else if (ch >= '0' && ch <= '9') {
				++dig;
			} else if (ch == ' ') {
				++spac;
			}
		}
		System.out.println("Vowels: " + vow);
		System.out.println("Consonants: " + consonants);
		System.out.println("Digits: " + dig);
		System.out.println("White spaces: " + spac);

	}

}
