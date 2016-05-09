package com.musichub.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY);
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id;
	private String username;
	private String password;
	transient private String cpassword;
	private String email;
	public User()
	{
		
	}
	/*public User(String name,String password,String cpassword,String email)
	{
		this.name=name;
		this.password=password;
		this.cpassword=cpassword;
		this.email=email;
	}*/
	
	
	public void setUsername(String username) {
		this.username = username;
	}
	


	public void setId(int id) {
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public String getEmail() {
		return email;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
