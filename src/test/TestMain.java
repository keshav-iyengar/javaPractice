package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

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

	@Test
	public void testDoFactorial() {
		assertEquals(Main.doFactorial(0), 1);
		assertEquals(Main.doFactorial(1), 1);
		assertEquals(Main.doFactorial(2), 2);
		assertEquals(Main.doFactorial(4), 24);
	}

	@Test
	public void testRemoveDuplicates() {
		assertEquals(Main.removeDuplicates(new int[] { 1, 2, 3 }), Arrays.asList(1, 2, 3));
		assertEquals(Main.removeDuplicates(new int[] { 1, 1, 1 }), Arrays.asList(1));
		assertEquals(Main.removeDuplicates(new int[] { 1, 2, 3, 4, 3, 5, 6, 2 }), Arrays.asList(1, 2, 3, 4, 5, 6));
	}

	@Test
	public void testGreatestCommonDivisor() {
		assertEquals(Main.greatestCommonDivisor(12, 6), 6);
		assertEquals(Main.greatestCommonDivisor(12, 8), 4);
		assertEquals(Main.greatestCommonDivisor(12, -8), 4);
		assertEquals(Main.greatestCommonDivisor(-12, 8), 4);
		assertEquals(Main.greatestCommonDivisor(-12, -8), 4);
		assertEquals(Main.greatestCommonDivisor(12, 0), 12);
		assertEquals(Main.greatestCommonDivisor(0, 12), 12);
		assertEquals(Main.greatestCommonDivisor(0, 0), 0);

	}

	@Test
	public void testGetSquareRoot() {
		assertEquals(Main.getSquareRoot(25), 5);
	}

	@Test
	public void testReverseArray() {
		assertArrayEquals(Main.reverseArray(new int[] { 1, 2, 3 }), new int[] { 3, 2, 1 });
		assertArrayEquals(Main.reverseArray(new int[] { 1, 2, 3, 2, 3 }), new int[] { 3, 2, 3, 2, 1 });
		assertArrayEquals(Main.reverseArray(new int[] { 1 }), new int[] { 1 });
	}

	@Test
	public void testIsAnagram() {
		assertEquals(Main.isAnagram("army", "mary"), true);
		assertEquals(Main.isAnagram("ARmy", "mary"), true);
		assertEquals(Main.isAnagram("army", "maryy"), false);
		assertEquals(Main.isAnagram("abcd", "abab"), false);
	}

}
