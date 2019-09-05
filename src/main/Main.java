package main;

public class Main {

	public static void main(String[] args) {

		//doFibRecurs(13, 0, 1);
		int i = fibonacci(7);
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

	public boolean isPrime(int num) {

		return true;
	}

}
