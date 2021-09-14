package com.at.assignments;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class StudentRead {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("emp");
		EntityManager manager = factory.createEntityManager();
		 Query query = manager.createQuery("from StudentCreateDTO");
		    List<StudentCreateDTO> lisdtos = query.getResultList();
		    for(StudentCreateDTO sDTO : lisdtos) {
		    	System.out.println(sDTO.getsName()+" "+sDTO.getsStream()+" "+sDTO.getsPer()+" "+sDTO.getsPhone()+" "+sDTO.getsAge());
		    }
	}
}