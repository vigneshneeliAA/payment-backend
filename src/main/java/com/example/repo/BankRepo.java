package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, String> {

}
