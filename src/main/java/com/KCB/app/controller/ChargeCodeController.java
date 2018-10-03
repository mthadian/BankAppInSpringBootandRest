package com.KCB.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KCB.app.dao.ChargeCodeRepo;
import com.KCB.app.model.ChargeCodes;

@RestController
public class ChargeCodeController 
{
	@Autowired
	ChargeCodeRepo CCRepo;
	
	@GetMapping("/ChargeCodes")
	public List<ChargeCodes> getAllChargeCodes()
	{
		return CCRepo.findAll();
	}
	
	@PostMapping("/ChargeCodes")
	public ChargeCodes addChargeCodes(@RequestBody ChargeCodes chargecode)
	{
		CCRepo.save(chargecode);
		return chargecode;
	}

}
