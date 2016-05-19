package com.musichub.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetail implements Serializable{
	private static final long serialVersionUID = 15L;

    @Id
    @GeneratedValue
    private int userId;

	@NotEmpty (message = "User name can not be empty.")
    private String userFullName;

	@NotEmpty (message = "Email name can not be empty.")
    private String userEmail;

	private String userPhone;

	@NotEmpty (message = "Username must not be empty.")
    private String username;

    @NotEmpty (message = "Password must not be empty.")
    private String password;

    private boolean enabled;

    @OneToOne
    @JoinColumn(name="billingAddressId")
    private BillingAdd billingAddress;

    @OneToOne
    @JoinColumn(name="shippingAddressId")
    private ShippingAdd shippingAddress;

    @OneToOne
    @JoinColumn(name = "cartId")
    @JsonIgnore
    private Cart cart;

   
}
