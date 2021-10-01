package com.at.stockmanagement.service;

import java.util.List;

import com.at.stockmanagement.model.AdminDTO;
import com.at.stockmanagement.model.ProductDTO;
import com.at.stockmanagement.model.UserDTO;

public interface ProductService {

	void insertreg(AdminDTO adto);

	void userreg(UserDTO udto);

	UserDTO loginValidation(String username, String password);

	void save(ProductDTO pdto);

	List<ProductDTO> getAllrecord();

	ProductDTO edit(int id);

	void update(ProductDTO pdto);

	void delete(int id);


	List<ProductDTO> search(String type, String key);






}
