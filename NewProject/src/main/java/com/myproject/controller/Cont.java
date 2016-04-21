package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.myproject.model.Product; 
import com.myproject.service.*;
 

import java.util.*;

@Controller
public class Cont {
	
	@Autowired
	ProductDAOService ps;

	@RequestMapping("/")
	public String abc()
	{
		return "index";
	}
	@RequestMapping("/Login")
	public String Login()
	{
		return "Login";
	}
	@RequestMapping("/contact")
	public String contact()
	{
		return "Contact";
	}
	@RequestMapping("/registration")
	public String register()
	{
		return "registration";
	}
	@RequestMapping("/Home")
	public String home()
	{
		return "Home";
	}
	@RequestMapping("/Product")
	public String product(Model m)
	{
    //ps=new ProductDAOService();
	List<Product> l=ps.productDetails();
		m.addAttribute("prod",l);
		return "product";
	}

	}
