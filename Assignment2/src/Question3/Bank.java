package Question3;

import java.util.*;

public class Bank {
	public String bankName;
	List<Customer> customers;
	
	public Bank(String bankName){
		this.bankName=bankName;
		this.customers=new ArrayList<Customer>();
	}
	
	public String getBankName() {
		return this.bankName;
	}
	
	public void addCustomer(Customer customer) {
		if(customers.size()==0) {
			customers.add(customer);
			System.out.println("Customer added");
		}
		else {
			for(int i=0;i<customers.size();i++) {
				if(customers.get(i).getCustomerName().equals(customer.getCustomerName())) {
					System.out.println("Customer already exists in bank");
				}
				else {
					customers.add(customer);
					System.out.println("Customer added!");
				}
			}
		}
	}
	
	public void deleteCustomer(Customer customer) {
		if(customers.size()==0) {
			System.out.println("No customers");
		}
		else {
			for(int i=0;i<customers.size();i++) {
				if(customers.get(i).getCustomerName().equals(customer.getCustomerName())) {
					customers.remove(customer);
					System.out.println("Customer deleted");
					
				}
				else {
					System.out.println("Customer doesn't exist");
				}
			}
		}
	}
	
	public void displayCustomers(Bank bank) {
		System.out.println(bank.getBankName());
		for(int i=0;i<customers.size();i++) {
			System.out.println("Customer "+(i+1));
			System.out.println("Customer name:"+customers.get(i).getCustomerName());
			System.out.println("Deposit type:"+customers.get(i).getDepositType());
			System.out.println("Base amount:"+customers.get(i).getBaseAmount());
		}
	}
}
