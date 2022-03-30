import java.util.ArrayList;
import java.util.List;

public class Shop {
	public static void main(String[] args) {
		
		
		List<Book> list = createBooks();
		
		list.sort((book1, book2) -> (int) (book1.getPrice() - book2.getPrice()) );
		
		System.out.println(list);

	}
	
	private static List<Book> createBooks() {
		
		List<Book> list = new ArrayList<>();
		
		list.add(new Book(500));
		list.add(new Book(200));
		list.add(new Book(800));
		list.add(new Book(300));
		list.add(new Book(1000));
		
		return list;
	}
}
