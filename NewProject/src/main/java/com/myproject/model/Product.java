package com.myproject.model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product{
@Id
	private int ID;
	private String name;
	private int price;
	private String description;
	
	public Product(){
		
	}

	public Product(int ID,String Name,int Price,String description)
	{
	this.ID=ID;
	this.name=Name;
	this.price=Price;
	this.description=description;

	}

	public int getID() {
		return ID;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
