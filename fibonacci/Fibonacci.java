package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter your int: ");
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		scanner.close();
		
		//int n = 6;
		
		System.out.println(fibonacci(n));
		
		
		
	}

	private static long fibonacci(int n) {
		
		if (n<=1) {
			return n;
		}
		return (fibonacci(n - 1) + fibonacci(n-2));
	}

}
