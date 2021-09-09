package com.at.student1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deleteservlet
 */
@WebServlet("/Deleteservlet")
public class Deleteservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String email=request.getParameter("em");
		String password=request.getParameter("pw");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?","root","admin@123");
			PreparedStatement pst=con.prepareStatement("delete from student where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
			int row=pst.executeUpdate();
			if(row==1) {
				pw.print("<h3><center>record deleted successfully</center></h3>");
			}
			else
			{
				pw.print("<h3><center>record not fount</center></h3>");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
