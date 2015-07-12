package com.programmaniaks.trainning.jsf.quotes.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.programmaniaks.trainning.jsf.quotes.model.Quote;

@Component
public class QuoteDao implements IQuoteLoader {

	@Override
	public String readRandomQuote(){
		RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return quote.getValue().getQuote();
	}
	
}
