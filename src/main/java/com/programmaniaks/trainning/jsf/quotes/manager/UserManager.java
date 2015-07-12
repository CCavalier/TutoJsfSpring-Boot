package com.programmaniaks.trainning.jsf.quotes.manager;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.programmaniaks.trainning.jsf.quotes.dao.IUserLoader;
import com.programmaniaks.trainning.jsf.quotes.model.User;

@Component
public class UserManager {

	@Inject	
	IUserLoader userLoader;
	
	public User login(String name, String password){
		return userLoader.connect(name, password);
		
	}
}
