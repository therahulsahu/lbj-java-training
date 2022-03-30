
public class BankDemo {
	public static void main(String[] args) {
		Customer cust1 = new Customer("Rahul Sahu", "bangalore", "9876543210", "rahul@gmail.com");
		Customer cust2 = new Customer("Nitesh Sharma", "pune", "9876543210", "nitesh@gmail.com");
		Customer cust3 = new Customer("Ankita", "bangalore", "9876543210", "ankita@gmail.com");
		
		Account ac1 = new Account(cust1, "30-March-2022", ACTYPE.SB, 500);
		Account ac2 = new Account(cust2, "29-March-2022", ACTYPE.SB, 500);
		Account ac3 = new Account(cust3, "31-March-2022", ACTYPE.FD, 5000);
	}
}
