package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.beans.Customer;
import com.example.repo.CustomerRepo;


@Service
public class CustomerService implements ICustomerService {
	@Autowired
	CustomerRepo customerrepo;

	@Override
	public Customer addCustomer(Customer customerrepor) {
		// TODO Auto-generated method stub
		return customerrepo.save(customerrepor);
	}


	@Override
	public Customer findById(String id) {
		// TODO Auto-generated method stub
		return customerrepo.findById(id).get();
	}


	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerrepo.findAll();	}


	@Override
	public Customer updateCustomer(Customer Customer) {
		// TODO Auto-generated method stub
		return customerrepo.save(Customer);
	}
}
