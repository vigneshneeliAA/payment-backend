package com.example.service;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Transaction;
import com.example.exception.ResourceFoundException;
import com.example.exception.SDNCheck;
import com.example.repo.TransactionRepo;

@Service
public class TransactionService implements ITransactionService {
	
	@Autowired
	TransactionRepo tpr;
	
	@Override
	public Transaction addTransaction(Transaction transaction)
	{
		boolean foo=false;
		if(transaction!=null) {
			transaction.setTransferdate( java.sql.Date.valueOf(LocalDate.now()));
			
			try {
				foo=SDNCheck.checkSDN(transaction.getReceiveraccountholdername());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(foo==false) {
				return tpr.save(transaction);
			}
			else
			{
				throw new ResourceFoundException("found in sdn list");
			}
			}
			else
			{
				return null;
			}
	}
	@Override
	public Transaction findById(int id)
	{
		return tpr.getById(id);
	}
	
	@Override
	public List<Transaction> findAll() {
		// TODO Auto-generated method stub
		return tpr.findAll();	}



	@Override
	public Transaction updateTransaction(Transaction t) {
		// TODO Auto-generated method stub
		return tpr.save(t);
	}
	

}
