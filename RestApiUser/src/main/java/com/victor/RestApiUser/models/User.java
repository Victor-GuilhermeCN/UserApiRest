package com.victor.RestApiUser.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private String login;
	
	private String password;
	
	public User() {}
	

	public User(Integer idUser, String name, String login, String password) {
		super();
		this.id = idUser;
		this.name = name;
		this.login = login;
		this.password = password;
	}

	public Integer getIdUser() {
		return id;
	}

	public void setIdUser(Integer idUser) {
		this.id = idUser;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
