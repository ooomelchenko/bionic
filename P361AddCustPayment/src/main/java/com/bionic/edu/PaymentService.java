package com.bionic.edu;

import java.util.List;

public interface PaymentService {
	public List<Payment> findByMerchantId(int id);
}
