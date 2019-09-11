package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		//doFibRecurs(13, 0, 1);
		Integer a = new Integer(2);
		Integer b = new Integer(2);

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

}
