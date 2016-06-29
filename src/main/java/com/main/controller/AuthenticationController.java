package com.main.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.main.util.SessionContext;

@RestController
@RequestMapping(name="/{id}")
public class AuthenticationController {

	@RequestMapping(method = RequestMethod.GET)
	public String saveCustomerID(@PathVariable ("id") int id){
		SessionContext.setCustomerId(id);
		
		return "Customer ID : " + SessionContext.getCustomerId();
	}
}
