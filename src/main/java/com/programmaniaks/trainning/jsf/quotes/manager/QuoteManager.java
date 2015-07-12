package com.programmaniaks.trainning.jsf.quotes.manager;

import javax.inject.Inject;
import javax.inject.Named;

import com.programmaniaks.trainning.jsf.quotes.dao.QuoteLoader;

@Named
public class QuoteManager {

	@Inject
	private QuoteLoader quoteLoader;
	
	
	public String findRandomQuote(){
		return quoteLoader.readRandomQuote();
	}
}
