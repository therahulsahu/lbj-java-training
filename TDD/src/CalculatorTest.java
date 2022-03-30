import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest extends BaseTest {
	
	@Test
	public void testDivide() {
		int result = calculator.divide(4, 2);
		assertEquals(2, result);
	}
	
	@Test
	public void testSubtract() {
		int result = calculator.subtract(10, 4);
		assertEquals(6, result);
	}

	@Test
	public void testAdd() {
		// AAA
		// Arrange -> Act -> Assert
		
		int result = calculator.add(2, 3);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddWithZero() {
		
		int result = calculator.add(0, 3);
		assertEquals(3, result);
	}

}
