package com.musichub.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
public class Cart {
	private static final long serialVersionUID = 13L;

    @Id
    @GeneratedValue
    private int cartId;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CartItem> cartItems;

    @OneToOne
    @JoinColumn(name = "userId")
    @JsonIgnore
   private UserDetail userdetails;
	private double grandTotal;
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getCartId() {
		return cartId;
	}
	public List<CartItem> getCartItems() {
		return cartItems;
	}
	public UserDetail getUserdetails() {
		return userdetails;
	}
	public double getGrandTotal() {
		return grandTotal;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public void setUserdetails(UserDetail userdetails) {
		this.userdetails = userdetails;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	
	
	
}
