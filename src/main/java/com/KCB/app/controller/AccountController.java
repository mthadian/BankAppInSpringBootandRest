package com.KCB.app.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.accountRepo;
import com.KCB.app.model.Accounts;

@RestController
public class AccountController 
{
	@Autowired
	
	accountRepo a_Repo;
	
	@RequestMapping("/addAccount")
	public String addAccount(Accounts account)
	{
		a_Repo.save(account);
		return "accounts.jsp";
	}
	
	@PostMapping("/Accounts/add")
	public Accounts addPAccount(@RequestBody Accounts account)
	{
		a_Repo.save(account);
		return account;
	}
	
	@PutMapping("/Accounts/edit")
	public Accounts editAccounts(@RequestBody Accounts account)
	{
		a_Repo.save(account);
		return account;
	}
	
	@DeleteMapping("/Accounts/delete/{AccId}")
	public String deleteAccounts(@PathVariable("AccId") int AccId)
	{
		Accounts acc=a_Repo.getOne(AccId);
		a_Repo.delete(acc);
		return "Account deleted";
	}
	
	
	/*
	@RequestMapping("/getAccount")
	public ModelAndView getAccount(@RequestParam int AccId)
	{
		ModelAndView mv=new ModelAndView("getAccount.jsp");
		Accounts acount=a_Repo.findById(AccId).orElse(new Accounts());
		mv.addObject(acount);
		return mv;
	}
	*/
	@GetMapping("/getAccount")
	public String getAccount(Model model,@RequestParam int AccId)
	{
		model.addAttribute("message", a_Repo.findById(AccId).orElse(new Accounts()));
		return "getAccount.jsp";
	}
	
	@GetMapping("/Accounts/all")
	public List<Accounts> getAllAccounts()
	{
		return a_Repo.findAll();
	}
	
	@GetMapping("/getcusAccounts")
	
	public String getcusAccounts(Model model,@RequestParam int customerId)
	{
		model.addAttribute("message", a_Repo.findByCustomerId(customerId));
		return "getAccount.jsp";
	}
	
	
	//displays in browser with input field
	@GetMapping("/getRcusAccounts")
	
	public List<Accounts> getRcusAccounts(int customerId)
	{
		
		return a_Repo.findByCustomerId(customerId);
	}
	
	@GetMapping("/CustomerAccounts/id/{AccId}")
	
	public List<Accounts> getCustomerAccounts(@PathVariable("AccId") int customerId)
	{
		
		return a_Repo.findByCustomerId(customerId);
	}
	
	@GetMapping("/Accounts/id/{AccId}")
	public Optional<Accounts> getAccountsById(@PathVariable("AccId") int AccId)
	{
		return a_Repo.findById(AccId);
	}
	
	
	
	
	
}
