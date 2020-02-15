package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kmd.model.Customer;

@Repository("customerRepo2")
public class CustomerRepositoryImpl2 implements CustomerRepository{
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("Rose");
		customer.setLastName("Marry");
		
		customers.add(customer);
		return customers;
	}
}
