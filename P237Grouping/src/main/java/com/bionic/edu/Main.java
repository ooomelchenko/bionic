package com.bionic.edu;

import java.util.Collection;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	     ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	     CustomerService customerService = context.getBean(CustomerService.class);
	     Customer customer = customerService.findById(1);
	     if (customer != null){
	     System.out.println(customer.toString());
	      Collection<Merchant> merchants = customer.getMerchants();
	     for (Merchant m : merchants) {	System.out.println(m.getName());}}}

	
}