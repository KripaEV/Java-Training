package Question1;

public class Customer implements iBanking{
	private String customerName;
	private String depositType;
	private int baseAmount;
	
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

	@Override
	public int depositAmount(int amount) {
		this.baseAmount=this.baseAmount+amount;
		return this.baseAmount;
	}

	@Override
	public int withdrawAmount(int amount) {
		this.baseAmount=this.baseAmount-amount;
		return this.baseAmount;
	}
	
}
