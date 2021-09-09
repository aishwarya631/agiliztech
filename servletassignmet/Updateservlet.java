package com.at.student1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Updateservlet
 */
@WebServlet("/Updateservlet")
public class Updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("em");
		String password = request.getParameter("pw");
		String sname = request.getParameter("sn");
		String phone = request.getParameter("ph");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?", "root", "admin@123");
			PreparedStatement pst = con.prepareStatement("update student  set phone=?, sname=? where email=? and password=?");
          	pst.setString(1, phone);
			pst.setString(2, sname);
			pst.setString(3, email);
			pst.setString(4, password);

			int row= pst.executeUpdate();
			if (row==1) {
				pw.print("<center><h3>your deatils updated successfully</h3></center>");
			} else {
				pw.print("<center><h3>your record not found</h3></center>");

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