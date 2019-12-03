package com.discountAssessment2;

import org.junit.Assert;
import org.junit.Test;

import test.discountAssessment2.service.CalculateBill;
import test.discountAssessment2.service.CalculateBillImpl;

public class CalculateBillTest {

	@Test
	public void testCustomer() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("customer", 1000, 200, 1);
		Assert.assertTrue(d==950);
	}
	
	@Test
	public void testOldCustomer() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("customer", 1000, 200, 2);
		Assert.assertTrue(d==910);
	}

	@Test
	public void testAffilliate() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("affilliate", 1000, 200, 1);
		Assert.assertTrue(d==870);
	}
	
	@Test
	public void testOldAffilliate() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("affilliate", 1000, 200, 2);
		Assert.assertTrue(d==870);
	}
	
	@Test
	public void testEmployee() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("employee", 1000, 200, 1);
		Assert.assertTrue(d==720);
	}
	
	@Test
	public void testOldEmployee() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("employee", 1000, 200, 2);
		Assert.assertTrue(d==720);
	}
	
	@Test(expected=RuntimeException.class)
	public void testOGroceriesGreaterThanBill() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("employee", 1000, 2000, 2);
		Assert.assertTrue(d==720);
	}

	@Test
	public void testInvalidCustomerType() {
		CalculateBill cb = new CalculateBillImpl();
		double d = cb.findBill("", 1000, 200, 2);
		Assert.assertTrue(d==0);
	}

}
