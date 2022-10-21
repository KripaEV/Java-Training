package Question3;

public class Customer {
	public String customerName;
	public String depositType;
	public int baseAmount;
	
	public Customer(String customerName, String depositType, int baseAmount){ 
		this.customerName=customerName;
		this.depositType=depositType;
		this.baseAmount=baseAmount;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public String getDepositType() {
		return this.depositType;
	}
	public int getBaseAmount() {
		return this.baseAmount;
	}
}
