package com.bionic.edu;

import java.time.LocalDate;
import java.time.Month;
import java.util.GregorianCalendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CustomerService customerService = (CustomerService)context.getBean("customerServiceImpl");
        
        Customer c = new Customer();
        c.setAddress("Italian av., 33, Antverp");
        c.setCcNo("12345612345600");
        c.setCcType("MasterCard");
        c.seteMail("vmo@gmail.com");
		LocalDate cld = LocalDate.of(2018, Month.MARCH, 31);
		c.setMaturity(java.sql.Date.valueOf(cld));
		c.setName("Victor Ter2");
		
		Payment p = new Payment();
		GregorianCalendar cld1 = new GregorianCalendar(2015, 02, 03);
		java.util.Date dt1 = cld1.getTime();
		p.setDt(new java.sql.Timestamp(dt1.getTime()));
		p.setGoods("Railway ticket");
		p.setMerchantId(2);
		p.setSumPayed(425.0);
		
		customerService.add(c, p);
	}
}