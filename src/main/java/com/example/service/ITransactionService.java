package com.example.service;

import java.util.List;

import com.example.beans.Transaction;

public interface ITransactionService {

	Transaction addTransaction(Transaction tr);

	Transaction findById(int id);

	List<Transaction> findAll();

	Transaction updateTransaction(Transaction t);

}