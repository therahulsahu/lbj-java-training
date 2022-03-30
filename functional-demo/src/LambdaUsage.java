import java.util.ArrayList;
import java.util.List;

public class LambdaUsage {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(8);
		
		list.forEach((Integer e) -> System.out.println("list item : " + e));
		
		
		
		list.sort((a, b) -> {
			System.out.println("a : " + a + ", b : " + b);
			return a - b;
		}); 
		
		System.out.println(list);
	}
}
