package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Main;

public class TestMain {

	@Before
	public void setUp() throws Exception {}

	@Test
	public void testFibonacci() {
		assertEquals(Main.fibonacci(5), 5);
		assertEquals(Main.fibonacci(7), 13);
	}

}
