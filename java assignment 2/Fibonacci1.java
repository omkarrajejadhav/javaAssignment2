//Find the Fibonacci Series up to Nth Term in Java Language
//a. Method 1: Using Iteration (Using Three variables)
//b. Method 2: Using Recursion
//c. Method 3: Using Formula a[i]=a[i-1]+a[i-2] (Using Array)
package javaassignmentclassroom;

import java.util.Scanner;

public class Fibonacci1 {
	Scanner sc = new Scanner(System.in);
	int n, a = 0, b = 1, c;

	public void fibonacciIteration() {

		System.out.println("enter the numer");
		n = sc.nextInt();
		System.out.print(a + " " + b);
		for (int i = 2; i <= n; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}

	}

	public void fibonacciRecursion(int n) {

		if (n > 0) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			n--;

			fibonacciRecursion(n);
		}

	}

	public void fibonacciArray(int arr[], int n) {
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 2] + arr[i - 1];
		}

		System.out.println("fibonacci series is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
