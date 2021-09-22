package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Bank;

import com.example.service.IBankService;

@RestController
public class BankController {
	@Autowired
	IBankService ibs;
	
	@PostMapping(value="bank")
	public Bank AddBanks( @RequestBody  Bank b)
	{
			return ibs.addBank(b);
	}
	@GetMapping(value="bank/{id}")
	public Bank FindBank(@PathVariable("id") String cid)
	{
		return ibs.findById(cid);
	}
	

}
