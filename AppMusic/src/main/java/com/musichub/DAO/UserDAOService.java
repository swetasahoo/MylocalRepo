package com.musichub.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.musichub.DAO.*;
//import com.musichub.model.*;
import com.musichub.model.*;
import com.musichub.DAO.*;


@Service
@Transactional
public class UserDAOService 
{
	@Autowired
	UserDAOImpl udi;
	
	/*@Autowired
	public UserDAOService(UserDAOImpl udi)
	{
		this.udi=udi;
	}
	*/
	public void save(User o)
	{
		udi.save(o);
	}


//*************Product Transaction**********************
	

	public Product lastproductid()
	{
		return this.udi.lastproductid();
	}
	public List<Product> listProducts()
	{
		System.out.println("in service");
		return udi.listProducts();
	}
    
	public void addProduct(Product p)
	{
	udi.addProduct(p);	
	}
	public void updateProduct(Product p)
	{
		udi.updateProduct(p);
	}
 
	public Product getProductById(int id)
	{
		return udi.getProductById(id);
	}
	public void deleteProduct(int id)
	{
		udi.deleteProduct(id);
	}
	
}


	

