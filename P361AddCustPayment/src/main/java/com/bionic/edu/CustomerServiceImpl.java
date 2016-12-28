package com.bionic.edu;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Named
public class CustomerServiceImpl implements CustomerService{
    @Inject
    private CustomerDao customerDao;
    @Inject
    private PaymentDao paymentDao;
    
    public Customer findById(int id) { 
    	return customerDao.findById(id); 
	}
    
   @Transactional(propagation=Propagation.REQUIRES_NEW)
   public void save(Customer customer){
	   customerDao.save(customer);
   }
   
   @Transactional
   public void add(Customer c, Payment p){
	   save(c);
	   System.out.println("id = "+c.getId());
	   p.setCustomerId(c.getId());
	   paymentDao.save(p);
   }

}
