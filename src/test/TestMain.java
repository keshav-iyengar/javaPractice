package test;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Before;
import org.junit.Test;

import main.BinaryTree;
import main.Main;
import main.Node;

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

	@Test
	public void testBinarySearch() {
		assertEquals(Main.binarySearch(new int[] { 1, 2, 3 }, 2), 1);
		assertEquals(Main.binarySearch(new int[] { 1, 2, 3, 4 }, 2), 1);
		assertEquals(Main.binarySearch(new int[] { 1, 2, 3, 4 }, 3), 2);
		assertEquals(Main.binarySearch(new int[] { 1, 2, 3, 4, 5 }, 4), 3);
		assertEquals(Main.binarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, 8), 7);
		assertEquals(Main.binarySearch(new int[] { 1, 2, 1, 4, 1, 5 }, 4), 4);
		assertEquals(Main.binarySearch(new int[] { 1 }, 1), 0);
		assertThrows(IllegalArgumentException.class, () -> {
			Main.binarySearch(new int[] { 1, 2, 3 }, 4);
		});
		assertThat(Main.binarySearch(new int[] { 1, 2, 3 }, 2), not(0));
	}

	@Test
	public void testFindFirstNonRepeatedChar() {
		assertEquals(Main.findFirstNonRepeatedChar("ABACCBDEF"), 'd');
		assertEquals(Main.findFirstNonRepeatedChar("ABCDA"), 'b');
		assertThrows(IllegalArgumentException.class, () -> {
			Main.findFirstNonRepeatedChar("AABB");
		});
	}

	@Test
	public void testDisplayTree() {
		Node node1AA = new Node(4);
		Node node1AB = new Node(5);
		Node node1A = new Node(2, node1AA, node1AB);

		Node node1BA = new Node(6);
		Node node1B = new Node(3, node1BA);

		Node node1 = new Node(1, node1A, node1B);
		node1.setIsRootNode(true);

		BinaryTree tree = new BinaryTree(node1);

		assertEquals(Main.displayTree(tree.getRootNode()), "1 2 3 4 5 6 ");

	}

	@Test
	public void testQuickSort() {
		assertArrayEquals(Main.quickSort(new int[] {}), new int[] {});
		assertArrayEquals(Main.quickSort(new int[] { 1 }), new int[] { 1 });
		assertArrayEquals(Main.quickSort(new int[] { 1, 2, 4, 3, 5 }), new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(Main.quickSort(new int[] { 1, 5, 3, 4, 8, 2, 9 }), new int[] { 1, 2, 3, 4, 5, 8, 9 });
	}

	@Test
	public void testInsertionSort() {
		assertArrayEquals(Main.insertionSort(new int[] { 5, 4, 3, 2, 1 }), new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(Main.insertionSort(new int[] { 5, 5, 3, 2, 1 }), new int[] { 1, 2, 3, 5, 5 });
		assertArrayEquals(Main.insertionSort(new int[] { 5, 4, 3, 4, 5, 6 }), new int[] { 3, 4, 4, 5, 5, 6 });
	}

	@Test
	public void testRecursiveInsertionSort() {
		assertArrayEquals(Main.recursiveInsertionSort(new int[] { 5, 4, 3, 2, 1 }, 1), new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(Main.recursiveInsertionSort(new int[] { 5, 5, 3, 2, 1 }, 1), new int[] { 1, 2, 3, 5, 5 });
		assertArrayEquals(Main.recursiveInsertionSort(new int[] { 5, 4, 3, 4, 5, 6 }, 1),
				new int[] { 3, 4, 4, 5, 5, 6 });
	}

	@Test
	public void testBubbleSort() {
		assertArrayEquals(Main.bubbleSort(new int[] { 5, 4, 3, 2, 1 }), new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(Main.bubbleSort(new int[] { 5, 5, 3, 2, 1 }), new int[] { 1, 2, 3, 5, 5 });
		assertArrayEquals(Main.bubbleSort(new int[] { 5, 4, 3, 4, 5, 6 }), new int[] { 3, 4, 4, 5, 5, 6 });
	}

	@Test
	public void testTransposeMatrix() {
		int[] firstCol = { 6, 1 };
		int[] secondCol = { 4, -9 };
		int[] thirdCol = { 24, 8 };
		int[][] matrix = { firstCol, secondCol, thirdCol };

		firstCol = new int[] { 6, 4, 24 };
		secondCol = new int[] { 1, -9, 8 };
		int[][] transposedMatrix = { firstCol, secondCol };

		assertArrayEquals(Main.transposeMatrix(matrix), transposedMatrix);
	}

	@Test
	public void testAddMatrices() {
		int[] firstCol = { 1, 3 };
		int[] secondCol = { 2, 0 };
		int[] thirdCol = { 3, 2 };
		int[][] matrix1 = { firstCol, secondCol, thirdCol };

		firstCol = new int[] { 2, 4 };
		secondCol = new int[] { 5, 8 };
		thirdCol = new int[] { 6, 9 };
		int[][] matrix2 = { firstCol, secondCol, thirdCol };

		firstCol = new int[] { 3, 7 };
		secondCol = new int[] { 7, 8 };
		thirdCol = new int[] { 9, 11 };
		int[][] result = { firstCol, secondCol, thirdCol };

		assertArrayEquals(Main.addMatrices(matrix1, matrix2), result);
	}

	@Test
	public void testMultiplyMatrices() {
		int[] firstCol = { 1, 4 };
		int[] secondCol = { 2, 5 };
		int[] thirdCol = { 3, 6 };
		int[][] matrix1 = { firstCol, secondCol, thirdCol };

		firstCol = new int[] { 1, 2, 3 };
		secondCol = new int[] { 4, 5, 6 };
		int[][] matrix2 = { firstCol, secondCol };

		firstCol = new int[] { 14, 32 };
		secondCol = new int[] { 32, 77 };
		int[][] result = { firstCol, secondCol };

		assertArrayEquals(Main.multiplyMatrices(matrix1, matrix2), result);
	}

	//	@Test
	//	public void testRemoveWhitespace() {
	//
	//		String str1 = "ABC DEF GHI";
	//		String str2 = "ABCDEFGHI";
	//
	//		assertEquals(Main.removeWhitespace(str1), str2);
	//	}
	@Test
	public void testReverseList() {
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5, 4, 3, 2, 1));
		assertEquals(Main.reverseList(list1), list2);
	}

	@Test
	public void testSortLinkedList() {
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(1, 2, 5, 4, 3, 7, 6));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		assertEquals(Main.sortLinkedList(list1), list2);
	}

}
