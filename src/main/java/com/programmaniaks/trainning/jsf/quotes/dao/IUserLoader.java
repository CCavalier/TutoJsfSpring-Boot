package com.programmaniaks.trainning.jsf.quotes.dao;

import com.programmaniaks.trainning.jsf.quotes.model.User;

public interface IUserLoader {

	User connect(String name, String password);

}
