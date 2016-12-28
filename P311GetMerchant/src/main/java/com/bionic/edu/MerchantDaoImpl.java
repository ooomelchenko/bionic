package com.bionic.edu; 

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.*;

@Repository
public class MerchantDaoImpl implements MerchantDao {

		@PersistenceContext
	    private EntityManager em;

		@Override
		public Merchant findById(int id) {
			return em.find(Merchant.class, id);
		}
		public List<Merchant> findAll(){
	        TypedQuery<Merchant> query = 	  
	              em.createQuery("SELECT m FROM Merchant m", Merchant.class);
	         List<Merchant> listM = null;
	         listM = query.getResultList();
	         return listM; }
		@Override
		public List<Merchant> getSortedByNeedToPay() {
			String txt = "SELECT m FROM Merchant m ORDER BY m.needToSend";
		    TypedQuery<Merchant> query = em.createQuery(txt, Merchant.class);
		    return query.getResultList();
		}
		public List<Result> getTotalReport(){
		    String txt = "SELECT new com.bionic.edu.Result(m.name, SUM(p.chargePayed)) ";
		    txt += "FROM Payment p, Merchant m WHERE m.id = p.merchantId GROUP BY m.name"; 
		    TypedQuery<Result> query = em.createQuery(txt, Result.class);
		    return query.getResultList();
		}

}
