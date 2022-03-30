import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestArrayList {
	
	List<String> list;
	
	@Before
	public void init() {
		list = new ArrayList<String>();
	}
	
	@Test
	public void testAdd() {
		boolean result = list.add("hello");
		assertTrue(result);
		assertEquals(1, list.size());
		list.remove(0);
	}
	
	@Test
	public void testRemove() {
		list.add("hello");
		String result = list.remove(0);
		assertEquals("hello", result);
		assertEquals(0, list.size());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveFromBlank() {
		String result = list.remove(0);
		assertEquals("hello", result);
		assertEquals(0, list.size());
	}
}
