package com.programmaniaks.trainning.jsf.login.bean;

import javax.inject.Inject;
import javax.inject.Named;

import com.programmaniaks.trainning.jsf.quotes.manager.UserManager;
import com.programmaniaks.trainning.jsf.quotes.model.User;
@Named
public class UserBean {
	
	private String name;
	
	private String password;
	@Inject
	private UserManager userManager;
	
	private User connectedUser;
	
	public void connect(){
		setConnectedUser(userManager.login(name, password));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	public User getConnectedUser() {
		return connectedUser;
	}

	public void setConnectedUser(User connectedUser) {
		this.connectedUser = connectedUser;
	}

}
