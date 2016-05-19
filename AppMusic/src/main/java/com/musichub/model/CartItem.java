package com.musichub.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class CartItem {

	private static final long serialVersionUID = 14L;

    @Id
    @GeneratedValue
    private int cartItemId;

    @ManyToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "itemId")
    private Product item;

    private int quantity;
    private double totalPrice;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCartItemId() {
		return cartItemId;
	}
	public Cart getCart() {
		return cart;
	}
	public Product getItem() {
		return item;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public void setItem(Product item) {
		this.item = item;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

    
    
}
