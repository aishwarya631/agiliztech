package com.at.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ReadData {

	public static void main(String[] args) {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
			System.out.println("enter your username");
			String username = sc.nextLine();
			System.out.println("enter your password");
			String password = sc.next();
			Statement smt = con.createStatement();

			String sql = "Select * from user where username='" + username + "' and password='" + password + "'";

			ResultSet rs = smt.executeQuery(sql);

			if (rs.next()) {

				System.out.println("user id:" + rs.getInt(1));
				System.out.println("user Name:" + rs.getString(2));
				System.out.println("user password:" + rs.getString(3));
				System.out.println("user phonenumber:" + rs.getLong(4));
				System.out.println("user fullname:" + rs.getString(5));
				System.out.println("user address:" + rs.getString(6));

				System.out.println("Sure To delete Above Record Yes/No?");
				String ch = sc.next();
				if (ch.equalsIgnoreCase("yes")) {

					sql = "delete from user where username='" + username + "' and password='" + password + "'";

					smt.executeUpdate(sql);
					System.out.println("record deleted successfully");

				}
			} else {
				System.out.println("Record Not Found...");
			}

		} catch (ClassNotFoundException e) {
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