import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();  // unordered
		// use TreeSet for sorted order
		
		for(int i = 0; i < 20; ++i) {
			set.add("test" + i);
		}
		
		System.out.println(set);
	}
}
