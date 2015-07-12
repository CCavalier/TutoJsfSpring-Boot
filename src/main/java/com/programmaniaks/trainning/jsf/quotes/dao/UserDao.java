package com.programmaniaks.trainning.jsf.quotes.dao;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.programmaniaks.trainning.jsf.quotes.model.User;



@Component
public class UserDao implements IUserLoader {

	@Override
	public User connect (String name, String password){
		RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
		parts.add("username", name);
		parts.add("password", password);
		User user =  restTemplate.postForObject("http://localhost:9180/user/connect", parts, User.class);
		return user;
	}
}
