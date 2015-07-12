package com.programmaniaks.trainning.jsf.quotes.manager;

import javax.inject.Inject;
import javax.inject.Named;

import com.programmaniaks.trainning.jsf.quotes.dao.IQuoteLoader;

@Named
public class QuoteManager {

	@Inject
	private IQuoteLoader quoteLoader;
	
	
	public String findRandomQuote(){
		return quoteLoader.readRandomQuote();
	}
}
