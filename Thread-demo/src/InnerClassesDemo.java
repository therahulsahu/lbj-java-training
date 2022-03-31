
public class InnerClassesDemo {
	static class A {
		String name;
	}
	
	public static void main(String[] args) {
		InnerClassesDemo.A a = new InnerClassesDemo.A();
		System.out.println(a.name);
	}
}
