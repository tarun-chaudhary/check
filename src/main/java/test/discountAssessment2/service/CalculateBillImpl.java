package test.discountAssessment2.service;

import org.springframework.stereotype.Service;

import com.discountAssessment2.customerEnum.CustomerType;

import test.discountAssessment2.models.Affilliate;
import test.discountAssessment2.models.Customer;
import test.discountAssessment2.models.Employee;
import test.discountAssessment2.models.Person;

@Service
public class CalculateBillImpl implements CalculateBill {
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
	 * @return final bill amount
	 */
	public double findBill(String customerType, double billAmount, double groceriesAmount, double customerSince) {
		
		if(billAmount<groceriesAmount){
			throw new RuntimeException("groceriesAmount cant be greater than billAmount");
		}
		
		customerType = customerType.toLowerCase();


		CustomerType  enumObj = CustomerType.get(customerType);
		if(enumObj == CustomerType.NULL){
			throw new UserNotFoundException(customerType);
		}

		enumObj.getDiscount();
		
		Person person = null;


		person.setBillAmount(billAmount);
		person.setGroceriesAmount(groceriesAmount);
		if (customerSince >= 2) {
			person.setOldCustomer(true);
		}

		person.applyPercentageDiscount(enumObj.getDiscount());
		person.applyAmountDiscount(enumObj.getDiscount());

		return person.getBillAmount();

		/*public abstract class AbstractPerson {
		 have all attribute here 
		}
		
		public class Person extends AbstractPerson {
		
		public void calculate( Get the enum object ){
		 all business logic here 
		}
		
		}*/

	}
	
	
}
