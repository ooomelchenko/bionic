package com.bionic.edu;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{
    @PersistenceContext
    private EntityManager em;

    public Customer findById(int id){
    	Customer customer = null;
    	customer = em.find(Customer.class, id);
    	return customer;
    }
    
    public void save(Customer customer){
    	em.persist(customer);
    }
}
