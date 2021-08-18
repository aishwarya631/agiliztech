package com.at.example.assignment;

import java.util.Scanner;

public class Matrixsummulti {

	public static void main(String[] args) {

		int m, n, i, j, choice;

		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the choice : ");
		choice = sc.nextInt();

		switch (choice) {
		case 1:
			Scanner in = null;
			in = new Scanner(System.in);
			System.out.println("Enter the number of rows of the matrix");
			m = in.nextInt();
			System.out.println("Enter the number of columns of the matrix");
			n = in.nextInt();

			int first[][] = new int[m][n];

			System.out.println("Enter the elements of the matrix1");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					first[i][j] = in.nextInt();

			int second[][] = new int[m][n];

			System.out.println("Enter the elements of the matrix2");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					second[i][j] = in.nextInt();

			int sum[][] = new int[m][n];

			for (i = 0; i < first.length; i++) {
				for (j = 0; j < first[0].length; j++) {
					sum[i][j] = first[i][j] + second[i][j];

				}
			}
			System.out.println("sum of two matrices is: ");
			for (i = 0; i < first.length; i++) {
				for (j = 0; j < first[0].length; j++) {
					System.out.print("   " + sum[i][j]);

				}
				System.out.println();

			}
			break;

		case 2:
			Scanner sa = null;
			sa = new Scanner(System.in);
			System.out.println("Enter the number of rows of the matrix");
			m = sa.nextInt();
			System.out.println("Enter the number of columns of the matrix");
			n = sa.nextInt();

			int first1[][] = new int[m][n];

			System.out.println("Enter the elements of the matrix1");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					first1[i][j] = sa.nextInt();

			int second1[][] = new int[m][n];

			System.out.println("Enter the elements of the matrix2");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					second1[i][j] = sa.nextInt();

			int multi[][] = new int[m][n];

			for (i = 0; i < first1.length; i++) {
				for (j = 0; j < first1[0].length; j++) {
					multi[i][j] = first1[i][j] * second1[i][j];

				}
			}
			System.out.println("Multiplication of two matrices is: ");
			for (i = 0; i < first1.length; i++) {
				for (j = 0; j < first1[0].length; j++) {
					System.out.print("   " + multi[i][j]);

				}
				System.out.println();

			}
			break;

		case 3:
			Scanner se = null;
			se = new Scanner(System.in);
			System.out.println("Enter the number of rows of the matrix");
			m = se.nextInt();
			System.out.println("Enter the number of columns of the matrix");
			n = se.nextInt();

			int first2[][] = new int[m][n];

			System.out.println("Enter the elements of the matrix1");
			for (i = 0; i < m; i++)
				for (j = 0; j < n; j++)
					first2[i][j] = se.nextInt();

			int transpose[][] = new int[m][n];

			for (int k = 0; k < first2.length; k++) {
				for (int l = 0; l < first2[0].length; l++) {
					transpose[k][l] = first2[l][k];
				}
			}
			System.out.println("Printing Matrix After Transpose:");
			for (int k = 0; k < first2.length; k++) {
				for (int l = 0; l < first2[0].length; l++) {
					System.out.print(transpose[k][l] + " ");
				}
				System.out.println();
			}
			break;
		default:
			System.out.println("Enter the valid choice..");
		}

	}
}
