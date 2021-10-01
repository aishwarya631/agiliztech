package com.at.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.at.stockmanagement.dao.ProductDAO;
import com.at.stockmanagement.model.AdminDTO;
import com.at.stockmanagement.model.ProductDTO;
import com.at.stockmanagement.model.UserDTO;
@Component
public class ProductServiceImp implements ProductService{
  @Autowired
  private ProductDAO pdao;
	@Override
	public void insertreg(AdminDTO adto) {
		pdao.insertreg(adto);
	}
	@Override
	public void userreg(UserDTO udto) {
		         pdao.userreg(udto);
	}
	@Override
	public UserDTO loginValidation(String username, String password) {
		
			System.out.println(username + "otp verification");
			return pdao.loginvalidation(username, password);
		}
	@Override
	public void save(ProductDTO pdto) {
            pdao.save(pdto)	;	
	}
	@Override
	public List<ProductDTO> getAllrecord() {
		return pdao.getAllrecord();
	}
	@Override
	public ProductDTO edit(int id) {
		return pdao.edit(id);
	}
	@Override
	public void update(ProductDTO pdto) {
		pdao.update(pdto);
	}
	@Override
	public void delete(int id) {
		pdao.delete(id);
	}
	@Override
	public List<ProductDTO> search(String type, String key) {
		// TODO Auto-generated method stub
		return pdao.search(type,  key);
	}
		
	
}
	
	


