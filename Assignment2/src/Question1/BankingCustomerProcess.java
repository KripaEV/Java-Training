package Question1;

import java.util.*;

public class BankingCustomerProcess {
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
		List<Customer> cusList=new ArrayList<>();
		Customer cus1=new Customer("Tim","Current",1000);
		Customer cus2=new Customer("Jack","Savings",2000);
		
		cusList.add(cus1);
		cusList.add(cus2);
		
		for(int i=0;i<cusList.size();i++) {
			System.out.println("Customer "+(i+1));
			System.out.println("Customer name:"+cusList.get(i).getCustomerName());
			System.out.println("Deposit type:"+cusList.get(i).getDepositType());
			System.out.println("Base amount:"+cusList.get(i).getBaseAmount());
		}
		depositProcessing(cus1);
		withdrawProcessing(cus2);

	}
	
	public static void depositProcessing(Customer customer) {
		System.out.println("Enter the amount to be deposited:");
		int deposit_amount=scanner.nextInt();
		scanner.nextLine();
		System.out.println(deposit_amount+" is being deposited");
		int amount=customer.depositAmount(deposit_amount);
		System.out.println("Amount after depositing:"+amount);
	}
	
	public static void withdrawProcessing(Customer customer) {
		System.out.println("Enter the amount to withdraw:");
		int withdraw_amount=scanner.nextInt();
		scanner.nextLine();
		System.out.println(withdraw_amount+" is being withdrawn");
		int amount=customer.withdrawAmount(withdraw_amount);
		System.out.println("Amount after withdrawing:"+amount);
	}

}
