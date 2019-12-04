package com.discountAssessment2.service;

import java.util.Calendar;
import java.util.Date;
import java.util.function.BiFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.discountAssessment2.customerEnum.CustomerType;
import com.discountAssessment2.model.UserBean;
import com.discountAssessment2.models.Affilliate;
import com.discountAssessment2.models.Customer;
import com.discountAssessment2.models.Employee;
import com.discountAssessment2.models.Person;


public class CalculateBillImpl implements CalculateBill {
	
	@Autowired
	DiscountCalculation discountService;
	/**
	 * This method find the bill amount after application of discount
	 * 
	 * @param customerType
	 *            accepts employee, customer, affilliate as values in string
	 * @param billAmount
	 *            total bill amount
	 * @param groceriesAmount
	 *            groceries amount in bill amount
	 * @param customerSince
	 *            time period since customer is with company
	 * @return InvoicePayload includes final bill amount
	 */
	public InvoicePayload findBill(String uid, String customerType,double billAmount, double groceriesAmount, int customerSince) {
		
		if(billAmount<groceriesAmount){
			throw new RuntimeException("groceriesAmount cant be greater than billAmount");
		}
		customerType = customerType.toLowerCase();
		
		CustomerType enumObj = CustomerType.get(customerType);
		if(enumObj == CustomerType.NULL){
			throw new UserNotFoundException("invalid Customer Type"); //handleUserNotFoundException
		}
	
		UserBean user = new UserBean(uid,customerType,customerSince);
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		if ((currentYear - customerSince) >= 2 
				&& !"affiliate".equals(user.getUserType())
				&& !"employee".equals(user.getUserType())
			) 
		{
			user.setUserType("customer");			
		}
		
		BiFunction<Double, Double, Double> discountFunction = discountService.getDiscountFunction(user);
		
		Double discountAmount = discountFunction.apply(billAmount, groceriesAmount);
		
		InvoicePayload invoicePayload = new InvoicePayload(billAmount,discountAmount);		
		
		return invoicePayload;

	}
	
}
