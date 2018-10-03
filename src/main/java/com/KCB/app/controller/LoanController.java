package com.KCB.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.loanRepo;
import com.KCB.app.model.Loans;

@RestController
public class LoanController 
{
	@Autowired
	loanRepo lRepo;
	
	@GetMapping("/Loans")
	public List<Loans> getAllLoans()
	{
		return lRepo.findAll();
	}
	
	@PostMapping("/Loans")
	
	public Loans addLoan(@RequestBody Loans loan)
	{
		lRepo.save(loan);
		return loan;
	}
	

}
