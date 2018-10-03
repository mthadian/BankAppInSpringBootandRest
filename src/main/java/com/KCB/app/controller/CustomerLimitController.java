package com.KCB.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.CustomerLimitRepo;
import com.KCB.app.model.CustomerLimits;

@RestController
public class CustomerLimitController 
{
	
	@Autowired
	CustomerLimitRepo cLimitRepo;
	
	@GetMapping("/CustomerLimit")
	public List<CustomerLimits> getAllCustomerLimits()
	{
		return cLimitRepo.findAll();
	}
	
	@PostMapping("/CustomerLimit")
	public CustomerLimits addCustomerLimit(@RequestBody CustomerLimits customerLimit)
	{
		cLimitRepo.save(customerLimit);
		return customerLimit;
	}
	
}
