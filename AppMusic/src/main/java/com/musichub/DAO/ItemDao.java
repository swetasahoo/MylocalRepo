package com.musichub.DAO;

import java.util.List;

import com.musichub.model.Product;



public interface ItemDao {

    List<Product> getProductList();

    Product getProductById(int id);

    void addProduct(Product item);

    void editProduct(Product item);

    void deleteProduct(Product item);
}
