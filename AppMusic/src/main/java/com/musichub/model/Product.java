package com.musichub.model;

import java.beans.Transient;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ID;
	private String name;
	private String description;
    private int quantity;
	
	private int price;
	
	transient private MultipartFile  image;
	
	@Transient
	public MultipartFile getImage() {
		return image;
	}
	
	

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setImage(MultipartFile image) {
		this.image = image;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public int getPrice() {
		return price;
	}

	
	
}
