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

	@Test
	public void testIsPrime() {
		assertEquals(Main.isPrime(5), true);
		assertEquals(Main.isPrime(1), true);
		assertEquals(Main.isPrime(2), true);
		assertEquals(Main.isPrime(0), false);
		assertEquals(Main.isPrime(6), false);
	}

	@Test
	public void testIsPalindrome() {
		assertEquals(Main.isPalindrome("BCCB"), true);
		assertEquals(Main.isPalindrome("AABAA"), true);
		assertEquals(Main.isPalindrome("BCCBA"), false);
		assertEquals(Main.isPalindrome("ACABGFDCA"), false);
		assertEquals(Main.isPalindrome(""), true);
		assertEquals(Main.isPalindrome(" "), true);
	}

	@Test
	public void testReverseNum() {
		assertEquals(Main.reverseNum(2563), 3652);
		assertEquals(Main.reverseNum(1234567), 7654321);
		assertEquals(Main.reverseNum(10), 1);
		assertEquals(Main.reverseNum(0), 0);
		assertEquals(Main.reverseNum(1), 1);
	}

	@Test
	public void testIsIntPalindrome() {
		assertEquals(Main.isIntPalindrome(2563), false);
		assertEquals(Main.isIntPalindrome(256652), true);
		assertEquals(Main.isIntPalindrome(2563652), true);
		assertEquals(Main.isIntPalindrome(252), true);
		assertEquals(Main.isIntPalindrome(2), true);

	}

	@Test
	public void testCubeSum() {
		assertEquals(Main.cubeSum(15), 126);
	}

	@Test
	public void testIsArmstrongNum() {
		assertEquals(Main.isArmstrongNum(153), true);
		assertEquals(Main.isArmstrongNum(152), false);
		assertEquals(Main.isArmstrongNum(0), true);
		assertEquals(Main.isArmstrongNum(12), false);

	}

}
