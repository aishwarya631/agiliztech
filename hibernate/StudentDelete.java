package com.at.assignments;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentDelete {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		   Query query = manager.createQuery("delete from StudentCreateDTO where sPer<50");
		 int row=query.executeUpdate();
		  System.out.println("rows affected"+row);
		  transaction.commit();
	}

}
