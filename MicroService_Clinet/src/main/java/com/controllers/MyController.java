package com.controllers;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.db.ConversionValue;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String message() {
		return "Welcome";
	}

	@GetMapping("/currency-conversion/to/{to}/from/{from}/quantity/{quantity}")
	public ConversionValue getConversion(@PathVariable String to, @PathVariable String from,
			@PathVariable String quantity) {

		Map<String,String> uriVariables = new HashMap<>();
		uriVariables.put("to", to);
		uriVariables.put("from", from);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ConversionValue> entity = restTemplate.getForEntity("http://localhost:8000/currency-exchange/to/{to}/from/{from}",
			 ConversionValue.class,uriVariables);
		ConversionValue c = entity.getBody();
		c.setQuantity(BigDecimal.valueOf(Long.parseLong(quantity)));
		c.setTotalCalculatedAmount(c.getQuantity().multiply(c.getConversionMultiple()));
		return c;
	}
}
