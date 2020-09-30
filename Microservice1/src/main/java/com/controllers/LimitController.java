package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beans.MyLimitBean;
import com.config.MyConfiguration;

@RestController
public class LimitController {
	
	
	@Autowired
	MyConfiguration myconfig;
	
	@GetMapping("/limits-default")
	public MyLimitBean getDefault() {
		
		return new MyLimitBean(1,10);
	}
	
	@GetMapping("/limits")
	public MyLimitBean getFromProperty() {
		
		return new MyLimitBean(myconfig.getMinimum(),myconfig.getMaximum());
		
	}

}
