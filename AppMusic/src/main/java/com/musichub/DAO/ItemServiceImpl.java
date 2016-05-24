package com.musichub.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musichub.model.Product;


@Service
public class ItemServiceImpl implements ItemDao {

    @Autowired
    private ItemDao itemDao;

    public Product getProductById (int itemId) {
        return itemDao.getProductById(itemId);
    }

    public List<Product> getProductList () {
        return itemDao.getProductList();
    }

    public void addProduct(Product item) {
    	itemDao.addProduct(item);
    }

    public void editProduct(Product item) {
    	itemDao.editProduct(item);
    }

    public void deleteProduct(Product item) {
    	itemDao.deleteProduct(item);
    }
}
