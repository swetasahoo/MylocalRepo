package com.musichub.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class UserOrder {

	@Id
    @GeneratedValue
    private int userOrderId;
	@OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "userId")
    private UserDetail usersDetail;

	@OneToOne
    @JoinColumn(name = "billingAddressId")
    private BillingAdd billingAddress;

    @OneToOne
    @JoinColumn(name="shippingAddressId")
    private ShippingAdd shippingAddress;

	public int getUserOrderId() {
		return userOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public UserDetail getUsersDetail() {
		return usersDetail;
	}

	public BillingAdd getBillingAddress() {
		return billingAddress;
	}

	public ShippingAdd getShippingAddress() {
		return shippingAddress;
	}

	public void setUserOrderId(int userOrderId) {
		this.userOrderId = userOrderId;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void setUsersDetail(UserDetail usersDetail) {
		this.usersDetail = usersDetail;
	}

	public void setBillingAddress(BillingAdd billingAddress) {
		this.billingAddress = billingAddress;
	}

	public void setShippingAddress(ShippingAdd shippingAddress) {
		this.shippingAddress = shippingAddress;
	}




}
