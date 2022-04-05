enum STATUS {
	ACTIVE, INACTIVE, CLOSED
}
public class Account {
	private String ownerName;
	private String address;
	private float balanceAmount;
	private String createdDate;
	private STATUS status;
	
	
	
	public Account(String ownerName, String address, float balanceAmount, String createdDate, STATUS status) {
		if(balanceAmount < 0) {
			throw new IllegalArgumentException("Balance amount cannot be less than 0.");
		}
		this.ownerName = ownerName;
		this.address = address;
		this.balanceAmount = balanceAmount;
		this.createdDate = createdDate;
		this.status = status;
	}
	

	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public float getBalanceAmount() {
		return balanceAmount;
	}
	
	public void setBalanceAmount(float balanceAmount) {
		if(balanceAmount < 0) {
			throw new IllegalArgumentException("Balance amount cannot be less than 0.");
		}
		this.balanceAmount = balanceAmount;
	}
	
	public String getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	public STATUS getStatus() {
		return status;
	}
	
	public void setStatus(STATUS status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		String accountInfo;
		accountInfo = "Name : " + ownerName + "\nBalanceAmount : " + balanceAmount + "\nCreated Date : " + createdDate + "\nStatus : " + status;
		return accountInfo;
	}
	
	
}
