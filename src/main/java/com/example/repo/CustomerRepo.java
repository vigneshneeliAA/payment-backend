package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, String> {

}
