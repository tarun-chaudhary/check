package test.discountAssessment2.models;

import com.discountAssessment2.customerEnum.CustomerType;

//abst
public abstract class Person {
	protected double billAmount;
	protected double groceriesAmount;
	protected boolean oldCustomer = false;

	public abstract void applyPercentageDiscount(double d);

	public void applyAmountDiscount(double discount) {
		double discountTimes = this.billAmount / 100;
		for (int i = 0; i < discountTimes; i++) {
			this.billAmount -= 5;
		}
	}
	
	//caLCULATE(custumerType enum){ }
	public abstract void CalculatePercentadeDisc(String CustomerTypeEnum);

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public double getGroceriesAmount() {
		return groceriesAmount;
	}

	public void setGroceriesAmount(double groceriesAmount) {
		this.groceriesAmount = groceriesAmount;
	}

	public boolean isOldCustomer() {
		return oldCustomer;
	}

	public void setOldCustomer(boolean oldCustomer) {
		this.oldCustomer = oldCustomer;
	}


}
