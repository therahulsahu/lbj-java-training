import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(-1);
		list.add(10);
		
		Stream<Integer> s1 = list.stream();
		// filter items
//		Stream<Integer> filtered = s1.filter(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer arg0) {
//				
//				return arg0 > 0;
//			}
//		});
		
		// using lambda function
		Stream<Integer> filtered = s1.filter((arg0) -> arg0 > 0);
		
		//	accumulate into single value - reduce
//		Optional<Integer> reduced = filtered.reduce(new BinaryOperator<Integer>() {
//			
//			@Override
//			public Integer apply(Integer arg0, Integer arg1) {
//				
//				return arg0 + arg1;
//			}
//		});
		
		// using lambda function
		Optional<Integer> reduced = filtered.reduce((prev, current) -> prev + current);
		
		System.out.println(reduced.get());
		
		
		// collect into collections
//		List<Integer> finalValues = filtered.collect(Collectors.toList());
//		System.out.println(finalValues);
		
		
		
	}
}
