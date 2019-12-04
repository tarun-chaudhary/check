package com.discountAssessment2.models;

public class Affilliate extends Person {

	@Override
	public void applyPercentageDiscount(double d) {
		this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * 10) / 100);
	}

	@Override
	public void CalculatePercentadeDisc(String CustomerTypeEnum) {
		// TODO Auto-generated method stub
		
	}


}
