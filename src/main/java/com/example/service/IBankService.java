package com.example.service;

import com.example.beans.Bank;

import antlr.collections.List;

public interface IBankService {

	Bank addBank(Bank bi);

	Bank findById(String id);

	List findAll();

	Bank updateBank(Bank bi);

}