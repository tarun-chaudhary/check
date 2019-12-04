package com.discountAssessment2.service;

import java.util.Date;

final public class InvoicePayload {
	private final double billAmount;
	private final double discountAmount;
	private final double finalAmount;
	private final Date billDate;
	
	public InvoicePayload(double billAmount, double discountAmount) {
		super();
		this.billAmount = billAmount;
		this.discountAmount = discountAmount;
		this.finalAmount = billAmount-discountAmount;
		this.billDate = new Date();
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public double getFinalAmount() {
		return finalAmount;
	}
	public Date getBillDate() {
		return billDate;
	}
	

}
