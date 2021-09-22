package com.example.service;

import java.util.List;

import com.example.beans.Customer;

public interface ICustomerService {

	Customer addCustomer(Customer customerrepor);

	Customer findById(String id);

	List<Customer> findAll();

	Customer updateCustomer(Customer Customer);

}