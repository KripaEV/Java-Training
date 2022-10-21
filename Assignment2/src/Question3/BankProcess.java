package Question3;

import java.util.*;

public class BankProcess {
	//static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		Bank bank1=new Bank("ABC");
		Bank bank2=new Bank("DEF");
		
		Customer cus1=new Customer("Tim","Current",1000);
		Customer cus2=new Customer("Jack","Savings",2000);
		Customer cus3=new Customer("Rose","Fixed",2000);
		Customer cus4=new Customer("Lilly","Recurring",2000);
		addCustomerToBank(cus1, bank1);
		addCustomerToBank(cus2, bank2);
		displayCustomerOfBank(bank1);
		displayCustomerOfBank(bank2);
		deleteCustomerToBank(cus3,bank1);
		deleteCustomerToBank(cus1,bank1);
		addCustomerToBank(cus4, bank2);
		displayCustomerOfBank(bank1);
		displayCustomerOfBank(bank2);
		
	}
	
	public static void addCustomerToBank(Customer customer, Bank bank) {
		bank.addCustomer(customer);
	}
	
	public static void deleteCustomerToBank(Customer customer, Bank bank) {
		bank.deleteCustomer(customer);
	}
	
	public static void displayCustomerOfBank(Bank bank) {
		bank.displayCustomers(bank);
	}

}
