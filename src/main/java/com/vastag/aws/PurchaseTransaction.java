package com.vastag.aws;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class PurchaseTransaction {
	public String id;
	public String paymentType;
	public double amount;
	public String createdAt;

	public PurchaseTransaction() {
		// TODO Auto-generated constructor stub
	}

	public PurchaseTransaction(String id, String paymentType, double amount, String createdAt) {
		super();
		this.id = id;
		this.paymentType = paymentType;
		this.amount = amount;
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	
	
}