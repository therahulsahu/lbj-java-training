import java.io.IOException;

enum STATUS {
	NEW, DAMAGED, RETURN
}

public class Book {
	private String title;
	private float price;
	private STATUS status; // new, damaged, return
	
	public Book() {
		this.status = STATUS.NEW;
	}
	
	public Book(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book price : " + this.price ;
	}
	
	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) throws InvalidPriceException {
		if(price <= 0) {
			// IOException is a compile time exception
			// It needs to be handled with try catch or deferred
			throw new InvalidPriceException("Price > 0");
			
		}
		this.price = price;
	}
}
