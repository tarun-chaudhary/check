package com.discountAssessment2;

import org.junit.Assert;
import org.junit.Test;

import com.discountAssessment2.service.CalculateBill;
import com.discountAssessment2.service.CalculateBillImpl;
import com.discountAssessment2.service.InvoicePayload;

public class CalculateBillTest {

/*	@Test
	public void testCustomer() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","customer", 1000, 200, 2016);
		Assert.assertTrue(invoicePayload.getFinalAmount()==950);
	}*/
	
	@Test
	public void testOldCustomer() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","customer", 1000, 200, 2015);
		Assert.assertTrue(invoicePayload.getFinalAmount()==910);
	}

	/*@Test
	public void testAffilliate() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","affilliate", 1000, 200, 2018);
		Assert.assertTrue(invoicePayload.getFinalAmount()==870);
	}
	
	@Test
	public void testOldAffilliate() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","affilliate", 1000, 200, 2015);
		Assert.assertTrue(invoicePayload.getFinalAmount()==870);
	}
	
	@Test
	public void testEmployee() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload  = cb.findBill("112","employee", 1000, 200, 2018);
		Assert.assertTrue(invoicePayload.getFinalAmount()==720);
	}
	
	@Test
	public void testOldEmployee() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","employee", 1000, 200, 2014);
		Assert.assertTrue(invoicePayload.getFinalAmount()==720);
	}
	
	@Test(expected=RuntimeException.class)
	public void testOGroceriesGreaterThanBill() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","employee", 1000, 2000, 2014);
		Assert.assertTrue(invoicePayload.getFinalAmount()==720);
	}

	@Test
	public void testInvalidCustomerType() {
		CalculateBill cb = new CalculateBillImpl();
		InvoicePayload invoicePayload = cb.findBill("112","", 1000, 200, 2014);
		Assert.assertTrue(invoicePayload.getFinalAmount()==0);
	}*/

}
