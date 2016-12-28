package com.bionic.edu;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		PaymentService paymentService = 	context.getBean(PaymentService.class);
	     Payment p = paymentService.findById(2);
	     System.out.println(p.toString());

	}
	
}