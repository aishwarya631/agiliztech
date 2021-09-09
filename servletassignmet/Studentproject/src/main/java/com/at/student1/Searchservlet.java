package com.at.student1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Searchservlet
 */
@WebServlet("/Searchservlet")
public class Searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("em");
		String password = request.getParameter("pw");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?", "root", "admin@123");
			PreparedStatement pst = con.prepareStatement("select *from student where email=? and password=?");
			pst.setString(1, email);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			if (rs.next()) {
				pw.print("<center>");
				pw.print("<table width=25% border=1>");
				pw.print("<center><h1>YOUR RECORDS:</h1></center>");
			
				pw.print("<tr>");
				pw.print("<td>" + rsmd.getColumnName(1) + "</td>");
				pw.print("<td>" + rs.getString(1) + "</td></tr>");
				pw.print("<tr><td>" + rsmd.getColumnName(2) + "</td>");
				pw.print("<td>" + rs.getString(2) + "</td></tr>");
				pw.print("<tr><td>" + rsmd.getColumnName(3) + "</td>");
				pw.print("<td>" + rs.getString(3) + "</td></tr>");
				pw.print("<tr><td>" + rsmd.getColumnName(4) + "</td>");
				pw.print("<td>" + rs.getString(4) + "</td></tr>");
				pw.print("</table></center>");
				
			} else {
				pw.print("<h1><center>no such data fount please relogin</center></h1>");
				RequestDispatcher rd = request.getRequestDispatcher("search.html");
				rd.include(request, response);
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
