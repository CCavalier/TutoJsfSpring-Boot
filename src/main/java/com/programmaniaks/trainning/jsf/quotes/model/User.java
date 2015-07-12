package com.programmaniaks.trainning.jsf.quotes.model;

import java.util.Date;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	private Long id;
	private String password;
	private String name;
	private Date dateOfBirth;
	private String username;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

}
