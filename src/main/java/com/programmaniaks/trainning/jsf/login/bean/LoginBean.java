package com.programmaniaks.trainning.jsf.login.bean;

import java.io.Serializable;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.programmaniaks.trainning.jsf.quotes.manager.QuoteManager;


@Named
@Scope("session")
public class LoginBean implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -134574812570797362L;

	private String name;
	
	private String quote;
	
	@Inject
	private QuoteManager quoteManager;
	
	public String getQuote() {
		return quote;
	}
	public void setQuote(String quote) {
		this.quote = quote;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void printRandomQuote(){
		quote = quoteManager.findRandomQuote();
	}
}
