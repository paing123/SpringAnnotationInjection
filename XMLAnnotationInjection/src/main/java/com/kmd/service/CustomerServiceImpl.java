package com.kmd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

	//@Autowired
	private CustomerRepository customerRepo;

	//@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepo2) {
		System.out.println("in constructor injection");
		this.customerRepo = customerRepo2;
	}

//	@Autowired
//	public void setCustomerRepo(CustomerRepository customerRepo2) {
//		System.out.println("in setter injection");
//		this.customerRepo2 = customerRepo2;
//	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
}
