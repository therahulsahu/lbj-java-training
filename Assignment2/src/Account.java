enum ACTYPE {
	SB, FD
}
public class Account {
	private int accountNumber;
	private String acOpeningDate;
	private ACTYPE accountType;
	private double balance;
	private Customer customer;
	
	static int counter = 0;

	public Account(Customer customer, String acOpeningDate, ACTYPE accountType, double balance) {
		super();
		this.acOpeningDate = acOpeningDate;
		this.accountType = accountType;
		this.balance = balance;
		this.customer = customer;
		
		this.accountNumber = setAccountNumber();
	}
	
	
	private int setAccountNumber() {
		return 100000 + counter++ ;
	}
	
	@Override
	public String toString() {
		String format = "Account number : " + accountNumber + "\nCustomer ID : " + customer.getId() + "\nAccount type : " + accountType + "\nAccount creation date : " + acOpeningDate + "\n Account Balance : " + balance;
		return format;
	}
	
	public void showDetails() {
		System.out.println(this);
	}
	
}
