package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kmd.model.Customer;

@Repository("customerRepo")
public class CustomerRepositoryImpl implements CustomerRepository{
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Cake");
		
		customers.add(customer);
		return customers;
	}
}
