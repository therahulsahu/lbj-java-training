import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void testAdd() {
		Mathematics mathematics = new Mathematics();
		int result = mathematics.add(10, 20);
		assertEquals(30, result);
	}

}
