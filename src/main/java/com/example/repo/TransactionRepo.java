package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Transaction;

public interface TransactionRepo extends JpaRepository<Transaction,Integer> {

}
