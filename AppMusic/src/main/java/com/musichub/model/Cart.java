package com.musichub.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cart {
	@Id
    @GeneratedValue
    private int cartId;
	private List<CartItem> cartItems;

}
