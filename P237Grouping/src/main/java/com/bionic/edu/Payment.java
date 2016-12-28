package com.bionic.edu;

import java.text.SimpleDateFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Double chargePayed;
	private Double sumPayed;
	private String goods;
	private int customerId;
	private java.sql.Timestamp dt;
	@ManyToOne
	@JoinColumn(name="merchantId")
	private Merchant merchant;

	public Payment() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getChargePayed() {
		return chargePayed;
	}
	public void setChargePayed(Double chargePayed) {
		this.chargePayed = chargePayed;
	}
	public Double getSumPayed() {
		return sumPayed;
	}
	public void setSumPayed(Double sumPayed) {
		this.sumPayed = sumPayed;
	}
	public String getGoods() {
		return goods;
	}
	public void setGoods(String goods) {
		this.goods = goods;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public Merchant getMerchant() {
		return merchant;
	}
	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
	public java.sql.Timestamp getDt() {
		return dt;
	}
	public void setDt(java.sql.Timestamp dt) {
		this.dt = dt;
	}
	@Override
	public String toString() {
		String txt = "id = " + id + ";   date = ";
		SimpleDateFormat dtFrm = new SimpleDateFormat("dd.MM.yyyy"); 
        txt += dtFrm.format(dt) + "; merchant = " + merchant.getName();
		txt += "; sumPayed = " + sumPayed + "; chargePayed = " + chargePayed;
		return txt;

	}
	
}
