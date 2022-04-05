
public class BankService {
	
	private static void validateAccountStatus(Account account) {
		
		if(account.getStatus() == STATUS.CLOSED) {
			throw new IllegalArgumentException("This Account is closed.");
		}
		
		if(account.getStatus() == STATUS.INACTIVE) {
			throw new IllegalArgumentException("This Account is Inactive, Please Contact your branch for more details.");
		}
		
	}
	
	private static void deposit(Account account, float depositAmount) {
		
		validateAccountStatus(account);
		
		if(depositAmount < 0) {
			throw new IllegalArgumentException("Amount cannot be less than 0.");
		}
		
		float currentBalance = account.getBalanceAmount();
		account.setBalanceAmount(currentBalance + depositAmount);
		
	}
	
	private static void withdraw(Account account, float withdrawAmount) {
		
		validateAccountStatus(account);
		
		if(withdrawAmount < 0) {
			throw new IllegalArgumentException("Amount cannot be less than 0.");
		} else if (withdrawAmount > account.getBalanceAmount()) {
			throw new IllegalArgumentException("Not Enough Balance amount in account");
		}
		
		float currentBalance = account.getBalanceAmount();
		account.setBalanceAmount(currentBalance - withdrawAmount);
		
	}
	
	public static void main(String[] args) {
		
		Account savingsAccount = new SavingsAccount("Rahul Sahu", "Bangalore", 1000, "04-04-2022", STATUS.ACTIVE);
		Account dematAccount = new DematAccount("Nitesh Sharma", "Pune", 1500, "04-04-2022", STATUS.ACTIVE);
		Account currentAccount = new CurrentAccount("Ujjwal Kashyap", "Bangalore", 2000, "04-04-2022", STATUS.ACTIVE);
		
		deposit(savingsAccount, 500);
		
		System.out.println(savingsAccount + "\n");
		
		withdraw(savingsAccount, 650);
		
		System.out.println(savingsAccount);
		
		
	}
}
