package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		Node node1AA = new Node(4);
		Node node1AB = new Node(5);
		Node node1A = new Node(2, node1AA, node1AB);

		Node node1BA = new Node(6);
		Node node1B = new Node(3, node1BA);

		Node node1 = new Node(1, node1A, node1B);
		node1.setIsRootNode(true);

		BinaryTree tree = new BinaryTree(node1);
		System.out.println(displayTree(tree.getRootNode()));

	}

	public static void doFib(int limit) {

		int val1 = 0;
		int val2 = 1;
		int value = 0;

		System.out.print(1 + " ");
		for(int i = 1; i <= limit; i++) {

			value = val1 + val2;
			if(value > limit) break;
			System.out.print(value + " ");
			val1 = val2;
			val2 = value;
		}

	}

	/*
	 * number represents the index (ie the 1st, 2nd, etc.). Each value == the
	 * previous index's value + that index's previous value. Until we get to the
	 * beginning, where the previous and previous-1 index are 1 and 1, we must
	 * travel backwards.
	 */
	public static int fibonacci(int number) {
		if(number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2); //tail recursion
	}

	public static boolean isPrime(int num) {
		boolean flag = true;
		if(num == 0) return false;
		if(num != 1 || num != 2) {
			for(int i = 2; i < num; i++) {
				if(num % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static boolean isPalindrome(String input) {
		if(input.length() % 2 == 0) {
			for(int i = 0; i < input.length() / 2; i++) {
				if(input.charAt(i) == input.charAt(input.length() - 1 - i)) continue;
				else return false;
			}
		} else {
			for(int i = 0; i < ((input.length() + 1) / 2) - 1; i++) {
				if(input.charAt(i) == input.charAt(input.length() - 1 - i)) continue;
				else return false;
			}
		}
		return true;
	}

	//charAt length-1, length-1 - 1, etc.
	public static String reverse(String input) {
		if(input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

	public static boolean isIntPalindrome(int num) {

		return num == reverseNum(num);
	}

	public static int reverseNum(int num) {

		if(num < 10) return num;

		int exp = 0;
		int val = num;
		while(val > 10) {
			exp++;
			val = (int) val / 10;
		}

		return (num % 10) * (int) Math.pow(10, exp) + reverseNum(num / 10);

	}

	public static int cubeSum(int num) {

		if(num < 10) return (int) Math.pow(num, 3);

		return (int) (Math.pow((num % 10), 3) + cubeSum((int) num / 10));

	}

	public static boolean isArmstrongNum(int num) {
		return num == cubeSum(num);
	}

	public static int doFactorial(int num) {
		if(num == 0) return 1;
		return num * doFactorial(num - 1);
	}

	public static ArrayList<Integer> removeDuplicates(int[] arr) {
		ArrayList<Integer> listWithoutDuplicates = new ArrayList<Integer>();
		for(int num : arr) {
			if(!listWithoutDuplicates.contains(num)) listWithoutDuplicates.add(num);
		}
		return listWithoutDuplicates;
	}

	public static int greatestCommonDivisor(int num1, int num2) {

		if(num1 == 0) return num2;
		else if(num2 == 0) return num1;

		if(num1 < 0) num1 = num1 * (-1);
		if(num2 < 0) num2 = num2 * (-1);
		int higherNum, lowerNum;
		if(num1 > num2) {
			higherNum = num1;
			lowerNum = num2;
		} else {
			higherNum = num2;
			lowerNum = num1;
		}

		if(higherNum % lowerNum == 0) return lowerNum;
		else {
			int divisor = 0;
			for(int i = lowerNum - 1; i > 0; i--) {
				divisor = i;
				if((higherNum % i == 0) && (lowerNum % i == 0)) break;
			}
			return divisor;
		}
	}

	public static int getSquareRoot(int num) {

		if(num == 0) return 0;

		int counter = num;
		while(counter > 0) {
			if(counter * counter == num) return counter;
			else counter--;
		}
		return 0;
	}

	public static int[] reverseArray(int[] arr) {
		int[] reversed = new int[arr.length];
		int index = 0;
		for(int i = arr.length - 1; i >= 0; i--) {
			reversed[index] = arr[i];
			index++;
		}

		return reversed;

	}

	public static boolean isAnagram(String str1, String str2) {

		if(str1.length() != str2.length()) return false;

		for(int i = 0; i < str1.length(); i++) {
			if(str2.toLowerCase().contains(String.valueOf(str1.charAt(i)).toLowerCase())) continue;
			else return false;
		}

		return true;
	}

	public static int binarySearch(int[] arr, int find) {

		Arrays.sort(arr);
		int index = 0;

		if(arr.length == 1) {

			if(arr[index] == find) return index;
			else throw new IllegalArgumentException("Value not found.");

		} else if(arr.length % 2 == 0) index = arr.length / 2;

		else index = (arr.length - 1) / 2;

		if(arr[index] == find) return index;
		else if(arr[index] > find) return binarySearch(Arrays.copyOfRange(arr, 0, index), find);
		else return binarySearch(Arrays.copyOfRange(arr, index + 1, arr.length), find) + index + 1;

	}

	public static char findFirstNonRepeatedChar(String str) {

		StringBuilder sb = new StringBuilder(str.toLowerCase());
		char firstChar = sb.charAt(0);
		if(sb.toString().length() == 1) return firstChar;

		else {
			int counter;
			for(int c = 0; c < sb.length(); c++) {
				counter = 0;
				firstChar = sb.charAt(c);
				for(int i = c + 1; i < sb.length(); i++) {
					if(sb.charAt(i) == firstChar) {
						sb.deleteCharAt(i);
						counter++;
					}
				}
				if(counter != 0) {
					if(c == (sb.length() - 1)) throw new IllegalArgumentException("No non repeated chars.");
					else continue;
				} else return firstChar;
			}
		}
		return firstChar;
	}

	public static int findMiddleElement(LinkedList<Integer> list) {

		return list.get(list.size() / 2);

	}

	public static String displayTree(Node rootNode) {

		Node leftChild = rootNode.getLeftChild();
		Node rightChild = rootNode.getRightChild();

		StringBuilder sb = new StringBuilder(rootNode.isRootNode ? String.valueOf(rootNode.getData() + " ") : "");

		if(leftChild != null) {
			sb.append(String.valueOf(leftChild.getData() + " "));
			if(rightChild != null) {
				sb.append(String.valueOf(rightChild.getData() + " "));
				sb.append(displayTree(leftChild) + displayTree(rightChild));
			} else {
				sb.append(displayTree(leftChild));
			}
		}
		return sb.toString();

	}

	public static int[] quickSort(int[] arr) {

		if(arr.length == 0 || arr.length == 1) return arr;

		else {
			//identify pivot (rightmost)
			int pivotIndex = arr.length - 1;
			int pivot = arr[pivotIndex];

			//find length of left and right arrays
			int rightArrayLength = 0, leftArrayLength = 0;
			for(int i : arr) {
				if(i < pivot) {
					leftArrayLength++;
				} else {
					rightArrayLength++;
				}
			}
			int[] rightArray = new int[rightArrayLength];
			int[] leftArray = new int[leftArrayLength];

			//put pivot in right array
			rightArray[0] = pivot;

			//put < pivot in left, > pivot in right
			int indexRight = 1;
			int indexLeft = 0;
			for(int i = 0; i < pivotIndex; i++) {
				if(arr[i] < pivot) {
					leftArray[indexLeft] = arr[i];
					indexLeft++;
				} else {
					rightArray[indexRight] = arr[i];
					indexRight++;
				}
			}

			//sort left and right and combine
			int[] sortedArray = new int[leftArrayLength + rightArrayLength];
			if(leftArrayLength == 1) {
				if(rightArrayLength == 1) {
					sortedArray = concatArrays(leftArray, rightArray);
				} else {
					sortedArray = concatArrays(leftArray, quickSort(rightArray));
				}
			} else {
				if(rightArrayLength == 1) {
					sortedArray = concatArrays(quickSort(leftArray), rightArray);
				} else {
					sortedArray = concatArrays(quickSort(leftArray), quickSort(rightArray));
				}
			}

			return sortedArray;
		}

	}

	public static int[] concatArrays(int[] a1, int[] a2) {

		int[] combined = new int[a1.length + a2.length];
		for(int i = 0; i < a1.length; i++) {
			combined[i] = a1[i];
		}
		for(int i = a1.length; i < combined.length; i++) {
			combined[i] = a2[i - a1.length];
		}

		return combined;
	}

	public static int[] swapElements(int[] arr, int index1, int index2) {

		if(index1 >= arr.length || index2 >= arr.length)
			throw new IndexOutOfBoundsException("One or more index out of bounds.");
		else {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
			return arr;
		}

	}

	public static int[] insertionSort(int[] arr) {

		int[] sortedArray = arr;
		if(arr.length == 0 || arr.length == 1) return sortedArray;
		else {
			int comparer; //value to be shifted
			int comparerIndex; //comparer index that changes as we shift
			int origComparerIndex = 1; //retain original comparer index
			int compared; //value to be compared against

			while(origComparerIndex < sortedArray.length) {

				comparerIndex = origComparerIndex;
				comparer = sortedArray[comparerIndex];

				innerloop: for(int comparedIndex = comparerIndex - 1; comparedIndex >= 0; comparedIndex--) {

					compared = sortedArray[comparedIndex];

					if(comparer < compared) {
						sortedArray = swapElements(sortedArray, comparedIndex, comparerIndex);
						comparerIndex = comparedIndex;
						comparer = sortedArray[comparerIndex];
					} else {
						origComparerIndex++;
						break innerloop;
					}
				}
			}
			return sortedArray;
		}
	}

	public static int[] recursiveInsertionSort(int[] arr, int comparerIndex) {

		int[] sortedArray = arr;
		if(arr.length == 0 || arr.length == 1 || comparerIndex == 0 || comparerIndex >= arr.length) return sortedArray;
		else {

			int origComparerIndex = comparerIndex; //placeholder for current comparer position
			int comparedIndex = comparerIndex - 1;

			if(sortedArray[comparerIndex] < sortedArray[comparedIndex]) {
				sortedArray = swapElements(sortedArray, comparedIndex, comparerIndex);
				comparerIndex = comparedIndex;
				if(comparerIndex == 0) sortedArray = recursiveInsertionSort(sortedArray, origComparerIndex++);
				else sortedArray = recursiveInsertionSort(sortedArray, comparerIndex);
			} else {
				comparerIndex++;
				sortedArray = recursiveInsertionSort(sortedArray, comparerIndex);
			}

		}

		return sortedArray;
	}

}
