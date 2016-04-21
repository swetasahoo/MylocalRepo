package com.myproject.dao;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.model.*;

@Repository
public class ProductDAOImpl implements ProductDAO {
    
	List<Product> list;
	@Autowired
	private SessionFactory sf;
	public ProductDAOImpl()
	{
	 list=new ArrayList<Product>();
	}
	
	public List<Product> productDetails()
	{
		System.out.println("e1");
		//list=new ArrayList<Product>();
		Session s= sf.openSession();
		
		try{
			org.hibernate.Query query=s.createQuery("from Product");
			list=query.list();
			
		}
		catch(HibernateException e)
		{
			System.out.println(e.toString());
		}
	return list;
	}
	
}
