package test.discountAssessment2.models;

import com.discountAssessment2.customerEnum.CustomerType;

public class Employee extends Person {
	private double discount;
	public void applyPercentageDiscount(double discount) {
		this.billAmount = this.billAmount - (((this.billAmount - this.groceriesAmount) * discount) / 100);
	}

	@Override
	public void CalculatePercentadeDisc(String CustomerTypeEnum) {
		CustomerType customerType =  CustomerType.get(CustomerTypeEnum);
		discount = customerType.getDiscount();
		applyPercentageDiscount(discount);
	}

	

}
