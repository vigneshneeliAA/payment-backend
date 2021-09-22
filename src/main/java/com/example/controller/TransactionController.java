package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.beans.Transaction;
import com.example.service.ITransactionService;

@RestController
public class TransactionController {

	@Autowired
	ITransactionService itr;
	@PostMapping(value="transaction")
public ResponseEntity<Transaction> addTransactions(@RequestBody Transaction t)
{
		System.out.print(t);
	return new ResponseEntity<>(itr.addTransaction(t),HttpStatus.OK);
}

}
