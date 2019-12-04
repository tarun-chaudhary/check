package com.discountAssessment2.models;

public class Customer extends Person {

	@Override
	public void applyPercentageDiscount(double d) {
		if (oldCustomer)
			this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * 5) / 100);
	}

	@Override
	public void CalculatePercentadeDisc(String CustomerTypeEnum) {
		// TODO Auto-generated method stub
		
	}

}
