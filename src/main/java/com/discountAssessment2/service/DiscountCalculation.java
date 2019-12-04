package com.discountAssessment2.service;

import java.util.function.BiFunction;

import org.springframework.stereotype.Service;

import com.discountAssessment2.customerEnum.CustomerType;
import com.discountAssessment2.model.UserBean;

@Service 
public class DiscountCalculation {
	private final int fixedDiscount = 5;
	
	public BiFunction<Double,Double,Double> getDiscountFunction(UserBean user) {
		String userType = user.getUserType();
		CustomerType enumObj = CustomerType.get(userType);
		
		BiFunction<Double,Double,Double> discountFunction = null;
		switch(userType) {
			case "customer" :
			case "employee" :
			case "affilliate" :
				discountFunction = (billAmount,groceriesAmount)-> (billAmount-groceriesAmount) * enumObj.getDiscount()/100;
			    break;
			default:
				discountFunction = (billAmount,groceriesAmount)-> (double)(((int)(billAmount/100))*fixedDiscount);
			 
		}
		return discountFunction;
	}

}
