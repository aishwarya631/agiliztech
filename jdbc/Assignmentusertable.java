package com.at.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Assignmentusertable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = null;
		long phone, length;
		Connection con = null;
		boolean valid = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1,load and register done");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
			System.out.println("2,connection established");

			System.out.println("1.for insert\n2.for delete\n3.for read and update");
			System.out.println("eneter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter your id ");
				int id = sc.nextInt();
				System.out.println("enter your username");
				String username = sc.next();
				System.out.println("enter your password ");
				do {
					password = sc.next();
					if (password.length() < 8) {

						valid = false;
						System.out.println("invalid password please reenter");
						continue;
					} else {
						valid = true;
					}
				} while (!valid);
				System.out.println("enter your phonenumber ");

				do {
					phone = sc.nextLong();
					length = String.valueOf(phone).length();
					if (length < 10) {
						valid = false;
						System.out.println("Given phone number is invalid,please enter valid phone number");
						continue;
					}
					if (length > 10) {
						valid = false;
						System.out.println("Given phone number is invalid,please enter valid phone number");
						continue;
					}else {
						valid=true;
					}
				} while (!valid); 

				System.out.println("enter your fullname ");
				String fullname = sc.next();
				System.out.println("enter your address ");
				String useraddress = sc.next();
				System.out.println("your record inserted successfully");
				PreparedStatement pst = con.prepareStatement("insert into user values(?,?,?,?,?,?)");
				pst.setInt(1, id);
				pst.setString(2, username);
				pst.setString(3, password);
				pst.setLong(4, phone);
				pst.setString(5, fullname);
				pst.setString(6, useraddress);
				pst.execute();
				break;

			case 2:
				System.out.println("enter your username");
				String username1 = sc.next();
				System.out.println("enter your password");
				String password1 = sc.next();
				PreparedStatement pst2 = con.prepareStatement("delete from user where username=? and password=?");
				pst2.setString(1, username1);
				pst2.setString(2, password1);
				int row = pst2.executeUpdate();
				if (row == 1) {
					System.out.println("record deleted");
				} else {
					System.out.println("no records to delete");
				}
				break;
			case 3:
				System.out.println("enter your username");
				String username2 = sc.next();
				System.out.println("enter your password");
				String password2 = sc.next();
				Statement smt = con.createStatement();

				String q = "Select * from user where username='" + username2 + "' and password='" + password2 + "'";

				ResultSet rs = smt.executeQuery(q);

				if (rs.next()) {

					System.out.println("user id:" + rs.getInt(1));
					System.out.println("user Name:" + rs.getString(2));
					System.out.println("user password:" + rs.getString(3));
					System.out.println("user phonenumber:" + rs.getLong(4));
					System.out.println("user fullname:" + rs.getString(5));
					System.out.println("user address:" + rs.getString(6));

					System.out.println("Sure To update Above Record Yes/No?");
					String ch = sc.next();
					if (ch.equalsIgnoreCase("yes")) {
						// System.out.println("");
						System.out.println("update address");
						String useraddress1 = sc.next();
                        //we can add field which we can update in user details
						q = "update  user set useraddress='" + useraddress1 + "' where username='" + username2 + "' and password='"+password2+"'";
						smt.executeUpdate(q);
						System.out.println("record updated");
					} else {
						System.out.println("Record Not Found...");
					}

				}
				break;
			default:
				System.out.println("invalid choice");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			try {
				con.close();
				System.out.println("6 :close connection");
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}
}
