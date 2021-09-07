package com.at.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Loginuservalidate {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Connection con = null;
		int check = 0;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
              System.out.println("!!!!!!welcome to database!!!!!");
			for (int i = 0; i<3; i++) {
				
				System.out.println("enter account name:");
				String accname = sc.next();
				System.out.println("enter your account number:");
				int accnumber = sc.nextInt();
				Statement smt = con.createStatement();
				check++;
				String sql = "Select * from useraccount where accountname='"+accname+"' and accountnumber='"
						+ accnumber + "'";

				ResultSet rs = smt.executeQuery(sql);

				if (rs.next()) {
					System.out.println("user account Name    :" + rs.getString(1));

					System.out.println("user account number  :" + rs.getInt(2));
					System.out.println("user balance         :" + rs.getInt(3));
					break;

				} else {
					System.out.println("inavalid account name and account number please relogin");
					if (check==3) {
						System.out.println("your account blocked!!!!!");
					}
				}
			}
	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				con.close();
				//System.out.println("6 :close connection");
			} catch (SQLException e) {
				e.printStackTrace();

			}

		}

	}

}
