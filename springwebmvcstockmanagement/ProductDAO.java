package com.at.stockmanagement.dao;

import java.util.List;

import com.at.stockmanagement.model.AdminDTO;
import com.at.stockmanagement.model.ProductDTO;
import com.at.stockmanagement.model.UserDTO;

public interface ProductDAO {


	void insertreg(AdminDTO adto);

	void userreg(UserDTO udto);

	UserDTO loginvalidation(String username, String password);

	void save(ProductDTO pdto);

	List<ProductDTO> getAllrecord();

	ProductDTO edit(int id);

	void update(ProductDTO pdto);

	void delete(int id);
	
    List<ProductDTO> search(String type, String key);



}
