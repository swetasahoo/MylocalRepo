package com.musichub.DAO;

import com.musichub.model.Cart;

public interface CartService {

    Cart getCartById (int cartId);

    void update(Cart cart);
}
