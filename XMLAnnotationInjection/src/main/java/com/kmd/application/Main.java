package com.kmd.application;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kmd.model.Customer;
import com.kmd.service.CustomerService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService service = appContext.getBean("customerService",CustomerService.class);
		//CustomerService service1 = appContext.getBean("customerService",CustomerService.class);
		
		List<Customer> customers = service.findAll();
		
		for (Customer customer : customers) {
			System.out.println(customer.getFirstName());
			System.out.println(customer.getLastName());
		}		
	}
}
