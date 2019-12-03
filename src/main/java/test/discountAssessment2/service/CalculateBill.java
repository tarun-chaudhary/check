package test.discountAssessment2.service;

public interface CalculateBill {
	/**
	 * This method find the bill amount after application of discount
	 * @param customerType accepts employee, customer, affilliate as values in string
	 * @param billAmount total bill amount
	 * @param groceriesAmount groceries amount in bill amount
	 * @param customerSince time period since customer is with company
	 * @return final bill amount
	 */
	double findBill(String customerType, double billAmount, double groceriesAmount, double customerSince);
}
