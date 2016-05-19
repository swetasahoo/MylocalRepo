package com.musichub.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.databind.ser.Serializers;



public class ShippingAdd implements Serializable{
	 private static final long serialVersionUID = 18L;

	    @Id
	    @GeneratedValue
	    private int shippingAddressId;
		private String houseNumber;
	    private String addressLine1;
	    private String addressLine2;
	    private String city;
	    private String state;
	    private String country;
	    private String zipCode;

	    @OneToOne
	    private UserDetail usersDetail;

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public int getShippingAddressId() {
			return shippingAddressId;
		}

		public String getHouseNumber() {
			return houseNumber;
		}

		public String getAddressLine1() {
			return addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}

		public String getCity() {
			return city;
		}

		public String getState() {
			return state;
		}

		public String getCountry() {
			return country;
		}

		public String getZipCode() {
			return zipCode;
		}

		public UserDetail getUsersDetail() {
			return usersDetail;
		}

		public void setShippingAddressId(int shippingAddressId) {
			this.shippingAddressId = shippingAddressId;
		}

		public void setHouseNumber(String houseNumber) {
			this.houseNumber = houseNumber;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}

		public void setUserDetail(UserDetail usersDetail) {
			this.usersDetail = usersDetail;
		}
	    
	    

}
