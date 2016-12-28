package com.bionic.edu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class PaymentServiceImpl implements PaymentService{
    @Inject
    private PaymentDao paymentDao;
    
    public List<Payment> findByMerchantId(int id){
    	return paymentDao.findByMerchantId(id);
    }
}