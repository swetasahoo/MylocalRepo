package com.myproject.service;
import com.myproject.dao.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.model.Product;


@Service
public class ProductDAOService{
	
 private ProductDAOImpl pi;
		@Autowired
public ProductDAOService(ProductDAOImpl pi)
{
	this.pi=pi;
}
	 
	public List<Product> productDetails()
	{
		System.out.println("ero");
	return pi.productDetails();

		
	}

}
 