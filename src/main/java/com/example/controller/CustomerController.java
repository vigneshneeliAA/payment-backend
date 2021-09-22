package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Customer;
import com.example.service.ICustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService cus;
	
	@PostMapping(value="customer")
public Customer AddCustomer( @RequestBody  Customer cup)
{
		
		return cus.addCustomer(cup);
	
}
	@GetMapping(value="customer/{id}")
	public Customer FindCustomer(@PathVariable("id") String cid)
	{
		System.out.print(cid);
		return cus.findById(cid);
	}
	
	@GetMapping(value="customer")
	public List<Customer> FindCustomers()
	{
		return cus.findAll();
	}
	
	
}
