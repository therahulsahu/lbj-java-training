
@FunctionalInterface
interface MyFunctionalInterface {
	void count();
}

class Impl1 implements MyFunctionalInterface {
	
	@Override
	public void count() {
		
		System.out.println("Implemented with class");
	}
}

public class Test {
	public static void main(String[] args) {
		MyFunctionalInterface impl = () -> System.out.println("Implemented functional interface with lambda function");
		impl.count();
		
		Impl1 obj = new Impl1();
		obj.count();
	}
}
