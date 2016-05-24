package com.musichub.DAO;

import com.musichub.model.Cart;
import com.musichub.model.CartItem;

public interface CartItemDao {
	 void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(Cart cart);

	    CartItem getCartItemByItemId (int itemId);


}
