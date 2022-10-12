package com.vastag.aws;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Root {
	public String id;
	public String fullName;
	public String phoneNumber;
	public String address;
	public String createdAt;
	public ArrayList<PurchaseTransaction> purchaseTransactions = new ArrayList();

	public Root() {
	}

	public Root(String id, String fullName, String phoneNumber, String address, String createdAt,
			ArrayList<PurchaseTransaction> purchaseTransactions) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.createdAt = createdAt;
		this.purchaseTransactions = purchaseTransactions;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public ArrayList<PurchaseTransaction> getPurchaseTransactions() {
		return purchaseTransactions;
	}

	public void setPurchaseTransactions(ArrayList<PurchaseTransaction> purchaseTransactions) {
		this.purchaseTransactions = purchaseTransactions;
	}
	

}