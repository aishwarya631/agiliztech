package com.at.servlethb;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String fullname = request.getParameter("fn");
		String phone = request.getParameter("ph");
		Long phonenumer = Long.parseLong(phone);
		String username = request.getParameter("un");
		String password = request.getParameter("pw");
		String address = request.getParameter("ad");
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("user");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		UserDTO dto=new UserDTO();
		dto.setFullname(fullname);
		dto.setPhonenumber(phonenumer);
		dto.setUsername(username);
		dto.setPassword(password);
        dto.setAddress(address);
        manager.persist(dto);
        transaction.commit();
        manager.clear();
        factory.close();
        pw.write("registration done");

	}

}
