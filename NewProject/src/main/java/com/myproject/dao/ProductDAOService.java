package com.myproject.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.model.Product;


@Service
public class ProductDAOService {
	@Autowired
	ProductDAOImpl pi;
	//List<Product> l=null;

	
	public List<Product> productDetails()
	{
	List<Product> l=pi.productDetails();
	return l;
		
	}

}
 