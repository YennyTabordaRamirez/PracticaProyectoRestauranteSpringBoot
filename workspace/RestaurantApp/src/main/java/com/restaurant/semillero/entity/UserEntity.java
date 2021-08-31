package com.restaurant.semillero.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int id;

	@Column(name = "DOCUMENT", nullable = false)
	private String document;

	@Column(name = "FULLNAME", nullable = false)
	private String fullName;

	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Column(name = "TELEPHONE", nullable = false)
	private int telephone;

	@ManyToMany
	@JoinTable(name = "USER_ROLE", 
	joinColumns = @JoinColumn(name = "USER_ID"), 
	inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
	private Set<RoleEntity> rolesEntity;

	@Column(name = "LOGIN", length = 30, nullable = false)
	private String login;

	@Column(name = "PASSWORD", length = 30, nullable = false)
	private String password;

	public UserEntity() {

	}

	public UserEntity(int id, String document, String fullName, String email, int telephone, String login,
			String password) {
		super();
		this.id = id;
		this.document = document;
		this.fullName = fullName;
		this.email = email;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
	}

	public Set<RoleEntity> getRolesEntity() {
		return rolesEntity;
	}

	public void setRolesEntity(Set<RoleEntity> rolesEntity) {
		this.rolesEntity = rolesEntity;
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
