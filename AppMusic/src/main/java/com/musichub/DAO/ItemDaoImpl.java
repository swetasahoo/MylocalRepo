package com.musichub.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.model.Product;



@Repository
@Transactional
public class ItemDaoImpl implements ItemDao {

    @Autowired
    private SessionFactory sessionFactory;

    public Product getProductById (int id) {
        Session session = sessionFactory.getCurrentSession();
        Product item = (Product) session.get(Product.class, id);
        session.flush();

        return item;
    }

    public List<Product> getProductList() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Item");
        List<Product> itemList = query.list();
        session.flush();

        return itemList;
    }

    public void addProduct (Product item) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(item);
        session.flush();
    }

    public void editProduct(Product item) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(item);
        session.flush();
    }

    public void deleteProduct (Product item) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(item);
        session.flush();
    }
}
