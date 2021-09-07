package com.at.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Callabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1.load and register has been done");
			 con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
			System.out.println("2:connection establishment has been done");
		CallableStatement  cst= con.prepareCall("{call emp.insert(?,?,?)}");
		System.out.println("3,statement has been created");
		System.out.println("set the values");
			cst.setInt(1, 6);
			cst.setString(2, "amir");
			cst.setDouble(3, 20000);
			cst.execute();
			System.out.println("4, query exicuted ");
			
		
		}catch(ClassNotFoundException e)
		{
		   e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
			con.close();
			System.out.println("6 :close connection");
		}
	  catch(SQLException e) {
		  e.printStackTrace();
	  }
	}


	}

}
