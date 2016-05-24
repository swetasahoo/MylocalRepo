package com.musichub.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musichub.model.Cart;
import com.musichub.model.CartItem;
import com.musichub.model.UserOrder;

@Service
public class OrderServiceImpl implements OrderDao {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CartService cartService;

    public void addOrder(UserOrder userOrder) {
    	orderDao.addOrder(userOrder);
    }

    public double getOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }
}