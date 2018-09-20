package com.KCB.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.customerRepo;
import com.KCB.app.model.Accounts;
import com.KCB.app.model.Customers;


@RestController
public class CustomerController 
{
	
	@Autowired	
	customerRepo Crepo;
	
	/*
	@RequestMapping("/")
	public String Home()
	{
		return "home.jsp";
	}
	 */
	@RequestMapping("/addCustomer")
	public String addCustomer(Customers customer)
	{
		Crepo.save(customer);
        return "index.jsp";
	}
	
	@PostMapping("/Customers/add")
	public Customers addPCustomers(@RequestBody Customers customer)
	{
		Crepo.save(customer);
		return customer;
	}
	
	@PutMapping("/Customers/edit")
	
	public Customers updateCustomers(@RequestBody Customers customer)
	{
		Crepo.save(customer);
		return customer;
	}
	
	@DeleteMapping("/Customers/delete/{Cid}")
	public String deleteCustomer(@PathVariable() int Cid)
	{
		Customers cus=Crepo.getOne(Cid);
		Crepo.delete(cus);
		return "Customer Deleted";
		
	}
	
	//Returns the customer on UI
	@GetMapping("/getCustomer")
	public String getCustomer(Model model,@RequestParam int Cid)
	{
		model.addAttribute("customer", Crepo.findById(Cid).orElse(new Customers()));
		return "customers.jsp";
	}
	
	@GetMapping("/Customers/all")
	public List<Customers> getCustomers()
	{
		return Crepo.findAll();
	}
	
	@GetMapping("/Customers/id/{Cid}")
	public Optional<Customers> getCusId(@PathVariable("Cid") int Cid)
	{
		return Crepo.findById(Cid);
	}

}
