package main;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		//doFibRecurs(13, 0, 1);
		int i = (int) 5.42;
		System.out.println(i);

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

}
