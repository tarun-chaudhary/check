package com.discountAssessment2.service;

public interface CalculateBill {
	/**
	 * This method find the bill amount after application of discount
	 * @param customerType accepts employee, customer, affilliate as values in string
	 * @param billAmount total bill amount
	 * @param groceriesAmount groceries amount in bill amount
	 * @param customerSince is year since customer is with company
	 * @return {@link InvoicePayload} includes final bill amount
	 */
	InvoicePayload findBill(String uid,String customerType, double billAmount, double groceriesAmount, int customerSince);
}
