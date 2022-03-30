
public class Customer {
	
	static int counter = 0;
	
	private int id;
	private String name, address, telephone, emailId;
	
	Customer(String name, String address, String telephone, String emailId) {
		this.name = name;
		this.address = address;
		this.telephone = telephone;
		this.emailId = emailId;
		
		this.id = 1000 + counter;
		counter++;
	}
	
	@Override
	public String toString() {
		String format = "Customer ID : " + id + "\nCustomer Name : " + name + "\nCustomer address : " + address + "\nCustomer email : " + emailId + "\n Customer Phone : " + telephone;
		return format;
	}
	
	
	public void showDetails() {
		System.out.println(this);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
