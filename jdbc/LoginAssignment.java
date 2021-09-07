package com.at.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginAssignment {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load and registration done");
			  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
			  System.out.println("enter your account name");
				String accname=scanner.next();
				System.out.println("enter your accountnumber");
				int accnumber=scanner.nextInt();
				System.out.println("enter your balance");
				int bal=scanner.nextInt();
				PreparedStatement pst=con.prepareStatement("insert into useraccount values(?,?,?)");
				pst.setString(1, accname);
				pst.setInt(2, accnumber);
				pst.setInt(3, bal);
				pst.execute();
				System.out.println("inserted successfully");
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
