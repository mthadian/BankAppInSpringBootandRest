package com.KCB.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.customerLoanRepo;
import com.KCB.app.model.CustomerLoans;

@RestController


public class CustomerLoanController
{
	@Autowired
	customerLoanRepo CLRepo;
	
	@GetMapping("/CustomerLoans")
	public List<CustomerLoans> getAllCustomerLoans()
	{
		return CLRepo.findAll();
		
	}
	
	@PostMapping("/CustomerLoans")
	
	public CustomerLoans addCustomerLoan(@RequestBody CustomerLoans customerloan)
	{
		CLRepo.save(customerloan);
		return customerloan;
		
	}
	

}
