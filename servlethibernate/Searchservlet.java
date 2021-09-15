package com.at.servlethb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Searchservlet")
public class Searchservlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String username = request.getParameter("un");
		String password = request.getParameter("pw");

		EntityManagerFactory factory=Persistence.createEntityManagerFactory("user");
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createQuery("from UserDTO where username='"+username+"' and password='"+password+"'");
		try {
			UserDTO dto=(UserDTO) query.getSingleResult();
			pw.print("user full name   :"+dto.getFullname());
			pw.print("   user phonenumber :"+dto.getPhonenumber());
			pw.print("     user address     :"+dto.getAddress());

		} catch (NoResultException e) {
	
			pw.print("<h1><center>no such records found please relogin</center></h1>");
			RequestDispatcher rd = request.getRequestDispatcher("search.html");
			rd.include(request, response);
		}
		manager.close();
		factory.close();
	}

}
