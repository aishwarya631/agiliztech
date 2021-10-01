package com.at.stockmanagement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;

import com.at.stockmanagement.model.AdminDTO;
import com.at.stockmanagement.model.ProductDTO;
import com.at.stockmanagement.model.UserDTO;
@Component
public class ProductDAOImp implements ProductDAO{
  
	private EntityManager getEntityManager(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("product");
		EntityManager manager=factory.createEntityManager();
		return manager;
	}
	@Override
	public void insertreg(AdminDTO adto) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(adto);
		transaction.commit();
		manager.close();
	}
	@Override
	public void userreg(UserDTO udto) {
		// TODO Auto-generated method stub
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(udto);
		transaction.commit();
		manager.close();
	}
	@Override
	public UserDTO loginvalidation(String username, String password) {
		try {
			EntityManager manager=getEntityManager();
			Query query = manager.createQuery("from UserDTO where username=?0 and password=?1");
			query.setParameter(0, username);
			query.setParameter(1, password);
			return (UserDTO) query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}
	@Override
	public void save(ProductDTO pdto) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(pdto);
		transaction.commit();
		manager.close();		
	}
	@Override
	public List<ProductDTO> getAllrecord() {
		EntityManager manager=getEntityManager();
		
        Query query = manager.createQuery(" from ProductDTO");
       return query.getResultList();	}
	@Override
	public ProductDTO edit(int id) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		ProductDTO pdto = manager.find(ProductDTO.class, id);
		transaction.commit();
		return pdto;	
		}
	@Override
	public void update(ProductDTO pdto) {
		EntityManager manager=getEntityManager();
        EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(pdto);
		transaction.commit();
		manager.close();
	}
	@Override
	public void delete(int id) {
		EntityManager manager=getEntityManager();

		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
	ProductDTO pdto = manager.find(ProductDTO.class, id);
		manager.remove(pdto);
		transaction.commit();
		manager.close();		
	}
	@Override
	public List<ProductDTO> search(String type, String key) {
		EntityManager manager=getEntityManager();

		List<ProductDTO> lispdto = null;
		Query query = null;
		if (type.equals("Select_By_Name")) {
			query = manager.createQuery("from ProductDTO where pname='" + key + "'");
			lispdto = query.getResultList();
		} else if (type.equals("Select_By_Category")) {
			query = manager.createQuery("from ProductDTO where category='" + key + "'");
			lispdto = query.getResultList();

		} else if (type.equals("Select_By_Company")) {
			query = manager.createQuery("from ProductDTO where company='" + key + "'");
			lispdto = query.getResultList();
		}
		manager.close();
		return lispdto;
	}

		

	}




