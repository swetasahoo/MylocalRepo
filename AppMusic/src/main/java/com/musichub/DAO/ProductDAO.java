package com.musichub.DAO;

import java.util.List;

import com.musichub.model.Product;

public interface ProductDAO {

public void addProduct(Product p);
public void updateProduct(Product p);
public List<Product> listProducts();
public Product getProductById(int id);
public void deleteProduct(int id);
public Product lastproductid();
}
