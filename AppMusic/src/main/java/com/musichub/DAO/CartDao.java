package com.musichub.DAO;

import java.io.IOException;

import com.musichub.model.Cart;



public interface CartDao {

    Cart getCartById (int cartId);

    Cart validate(int cartId) throws IOException;

    void update(Cart cart);
}
