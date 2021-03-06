package com.restaurant.semillero.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private int id;

	private String document;

	private String fullName;

	private String email;

	private int telephone;

	private String login;

	private String password;

	public UserDTO() {

	}

	public UserDTO(int id, String document, String fullName, String email, int telephone, 
			String login, String password) {
		super();
		this.id = id;
		this.document = document;
		this.fullName = fullName;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
