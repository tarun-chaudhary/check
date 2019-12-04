package com.discountAssessment2.customerEnum;

public enum CustomerType {

	NULL("null", 1.0),
	CUSTOMER("customer", 5.0),
	AFFILLIATE("affilliate",10.0),
	EMPLOYEE("employee",30.0);
	
	private final String value;
	private final double discount;


	CustomerType(String value, double discount) {
	this.value = value;
	this.discount = discount;
	}
	
	public static CustomerType get(String value) {
		if (value == null || value.equals("null") || value.equals("")) {
			return CustomerType.NULL;
		} else {
				for (CustomerType tObj : CustomerType.values())
				if (tObj.value.equals(value))
					return tObj;
			  }
			return CustomerType.NULL;
		}

		public double getDiscount(){
			return this.discount;
		}
		public String getType(){
			return this.value;
		}
	

}
