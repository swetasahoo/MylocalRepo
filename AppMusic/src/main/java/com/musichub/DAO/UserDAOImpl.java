package com.musichub.DAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.musichub.model.Product;
import com.musichub.model.User;

@Repository
public class UserDAOImpl implements UserDAO,ProductDAO 
{
	List<Product> l=new ArrayList<Product>();
	@Autowired
	private SessionFactory sf;
	
	public UserDAOImpl()
	{
		//list=new ArrayList<Product>();
	}
	public void save(User o)
	{
		Session s=sf.openSession();
		s.save(o);
		s.flush();
		s.close();
		
	}
	
	//*************Product transaction***********************
	public Product lastproductid()
	{
		Session s=sf.getCurrentSession();
		List <Product> result =  s.createQuery("from Product ORDER BY ID  desc LIMIT 1").list();
		Product p=(Product)result.get(0);
		//System.out.println(p.getID());
		return p;
	}
	
	public List<Product> listProducts()
	{
	System.out.println("in dao class"); 
	Session s=sf.getCurrentSession();
	System.out.println("session object create");
	  Query q=s.createQuery("from Product");
	  
	  l=(List<Product>)q.list();
	  return l;
	}
   
	public void addProduct(Product p)
	{
		//sf.getCurrentSession().save(p);
		sf.getCurrentSession().saveOrUpdate(p);
		
	}
	public void updateProduct(Product p)
	{
		sf.getCurrentSession().update(p);
	} 
	public Product getProductById(int id)
	{
		Session s=sf.getCurrentSession();
		Product p=(Product)s.load(Product.class,new Integer(id));
		System.out.println(p.getName());
		return p;
	}
	public void deleteProduct(int id)
	{
		Session s=sf.getCurrentSession();
		Product p=(Product)s.load(Product.class,new Integer(id));
		if(p!=null)
		{
			s.delete(p);
		}
	}
}
