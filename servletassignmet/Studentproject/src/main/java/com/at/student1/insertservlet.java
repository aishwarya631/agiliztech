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
 * Servlet implementation class insertservlet
 */
@WebServlet("/insertservlet")
public class insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String sname = request.getParameter("sn");
		String phone = request.getParameter("ph");
		Long phonenumer = Long.parseLong(phone);
		String email = request.getParameter("em");
		String password = request.getParameter("pw");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp?", "root", "admin@123");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?)");
			pst.setString(1, sname);
			pst.setString(2, phone);
			pst.setString(3, email);
			pst.setString(4, password);
			int row = pst.executeUpdate();
			pw.print("<h3><center>Registration done successfully</center></h3>");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
