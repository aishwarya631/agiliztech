package com.at.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;




public class Batchassign {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load and registration done");
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?user=root&password=admin@123");
		  Statement st=con.createStatement();
		   
		  st.addBatch("insert into useraccount values('aishu',65675,40000)");  
		 st.addBatch("insert into useraccount values('sanvi',5555,15000)");  
		    st.executeBatch();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
