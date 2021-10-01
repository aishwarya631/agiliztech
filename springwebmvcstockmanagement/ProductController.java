package com.at.stockmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.at.stockmanagement.model.AdminDTO;
import com.at.stockmanagement.model.ProductDTO;
import com.at.stockmanagement.model.UserDTO;
import com.at.stockmanagement.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@RequestMapping("/link1")
	public String getView1() {
		return "admin";
	}

	@RequestMapping("/adminlogin")
	public String getadminlogin() {
		return "adminlogin";
	}

	@RequestMapping("/adminreg")
	public String getadminregister() {
		return "adminreg";
	}

	@PostMapping("/adminlogin")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		System.out.println("data recieved by controller and pass it to the service");
		
		if (password.equals("1234") && username.equals("admin")) {
			return new ModelAndView("success");
		} else {
			return new ModelAndView("loginfailed", "msg", "sorry admin can only login");
		}
	}

	@RequestMapping("/link2")
	public String getView2() {
		return "user";
	}

	@RequestMapping("/add")
	public String getaddd() {
		return "add";
	}

	@RequestMapping("/userreg")
	public String getuserlogin() {
		return "userreg";
	}

	@RequestMapping("/userlogin")
	public String getuserregistration() {
		return "userlogin";
	}

	@PostMapping("/adminregistration")
	public String registration(@ModelAttribute AdminDTO adto) {
		service.insertreg(adto);
		return "adminsuccess";

	}

	@PostMapping("/userregistration")
	public String userregistration(@ModelAttribute UserDTO udto) {
		service.userreg(udto);
		return "adminsuccess";
	}

	@PostMapping("/userlogin")
	public ModelAndView userlogin(@RequestParam String username, @RequestParam String password) {
		System.out.println("data recieved by controller and pass it to the service");
		UserDTO udto = service.loginValidation(username, password);
		if (udto != null) {
			return new ModelAndView("usersuccess");
		} else {
			return new ModelAndView("userlogin", "msg", "login failed plz try again");
		}
	}
	@PostMapping("/addproduct")
	public String addproduct(@ModelAttribute ProductDTO pdto) {
		service.save(pdto);
		return "addsuccess";
	}
	@GetMapping("/View_all")
	private ModelAndView getAllrecord() {
		List<ProductDTO> lpdtos = service.getAllrecord();
		return new ModelAndView("viewall", "lpdtos", lpdtos);
	}
	@GetMapping("edit")
	public ModelAndView edit(@RequestParam int id) {
		ProductDTO pdto = service.edit(id);
		return new ModelAndView("updateproduct", "pdto", pdto);

	}

	@PostMapping("/update_product")
	public String updateproduct(@ModelAttribute ProductDTO pdto) {
		service.update(pdto);
		return "redirect:/View_all";
	}

	@GetMapping("delete")
	public String delete1(@RequestParam int id) {
		service.delete(id);
		return "redirect:/View_all";
	}
	@RequestMapping("/searchbyproduct")
	public String getbyname() {
		return "searchbyproduct";
	}
	@PostMapping("/searchproduct")
	public ModelAndView SearchProduct(@RequestParam String type, @RequestParam String key) {
		List<ProductDTO> lispdto =service.search(type, key);
		if (lispdto != null && !lispdto.isEmpty()) {
				return new ModelAndView("getrecord","lispdto",lispdto);
			}else {
			return new ModelAndView("searchfail");
		}

	}
}  
    


