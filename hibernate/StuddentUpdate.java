package com.at.assignments;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import org.w3c.dom.DOMConfiguration;

public class StuddentUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		   Query query = manager.createQuery("update StudentCreateDTO set sPer=sPer+10");
		 int row=query.executeUpdate();
		  System.out.println("rows affected"+row);
		  transaction.commit();
	}

}
