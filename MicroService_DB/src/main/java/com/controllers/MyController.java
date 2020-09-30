package com.controllers;

import java.math.BigDecimal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.db.ExchangeValue;
import com.repo.ExchangeValueRepository;

@RestController
public class MyController {
	
	@Autowired
	ExchangeValueRepository repo;
	
	@Autowired
	Environment env;
	
	
	@GetMapping("/hello")
	public String message() {
		return "Welcome";
	}
	
	@GetMapping("/currency-exchange-dummy/to/{to}/from/{from}")
	public ExchangeValue getConversionMultiple(@PathVariable String to, @PathVariable String from) {
		
		return new ExchangeValue(1,from,to,BigDecimal.valueOf(1000),8000);
		
	}
	
	@GetMapping("/currency-exchange/to/{to}/from/{from}")
	public ExchangeValue getConversion(@PathVariable String to, @PathVariable String from) {
	  Optional<ExchangeValue> value =	repo.findByValueFromAndValueTo(from, to);
	  int port = Integer.parseInt(env.getProperty("local.server.port"));
	  ExchangeValue exch = value.get();
	  exch.setPort(port);
	 return exch;
		
	}
	
	
	
	
	
	
}
