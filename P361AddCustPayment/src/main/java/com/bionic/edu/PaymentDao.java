package com.bionic.edu;

import java.util.List;

public interface PaymentDao {
	public List<Payment> findByMerchantId(int id);
	public void save(Payment p);
}
