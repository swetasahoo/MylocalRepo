package com.musichub.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musichub.model.Cart;
import com.musichub.model.CartItem;



@Service
public class CartItemServiceImpl implements CartItemDao{

    @Autowired
    private CartItemDao cartItemDao;

    public void addCartItem(CartItem cartItem) {
        cartItemDao.addCartItem(cartItem);
    }

    public void removeCartItem(CartItem cartItem) {
        cartItemDao.removeCartItem(cartItem);
    }

    public void removeAllCartItems(Cart cart){
        cartItemDao.removeAllCartItems(cart);
    }

    public CartItem getCartItemByItemId (int itemId) {
        return cartItemDao.getCartItemByItemId(itemId);
    }
}
