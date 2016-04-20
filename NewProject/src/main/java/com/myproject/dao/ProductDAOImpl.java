package com.myproject.dao;
import java.util.*;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import com.myproject.model.*;

@Repository
public class ProductDAOImpl implements ProductDAO
{


	@Autowired
	private SessionFactory sf;
	
	List<Product> list;
	public ProductDAOImpl()
	{
		list=new ArrayList<Product>();
	}
	
	public List<Product> productDetails()
	{
		System.out.println("e1");
	
		Session s=sf.getCurrentSession();
		System.out.println("e2");
		try{
			org.hibernate.Query query=s.createQuery("from PRODUCT");
			list=query.list();
			System.out.println("e3");
		}
		catch(HibernateException e)
		{
			System.out.println(e.toString());
		}
	return list;
	}
	
}
