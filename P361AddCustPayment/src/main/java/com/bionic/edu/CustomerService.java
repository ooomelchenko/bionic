package com.bionic.edu;

public interface CustomerService {
	public Customer findById(int id);
	public void save(Customer customer);
	public void add(Customer c, Payment p);
}