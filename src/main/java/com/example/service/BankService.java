package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Bank;
import com.example.beans.Customer;
import com.example.repo.BankRepo;

import antlr.collections.List;

@Service
public class BankService implements IBankService {
	
	@Autowired
	BankRepo br;
	@Override
	public Bank addBank(Bank bi)
	{
	return br.save(bi);
	}
	@Override
	public Bank findById(String id)
	{
		return br.findById(id).get();
	}
	@Override
	public List findAll() {
		
		return (List) br.findAll();	}
	
	@Override
	public Bank updateBank(Bank bi)
	{
		return br.save(bi);
	}
	{
		
	}
	
	

}
