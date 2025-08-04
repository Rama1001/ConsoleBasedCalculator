package com.task;

import java.util.Scanner;

public class Calculator {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int subtract(int a, int b) {
		return a - b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static double divide(int a, int b) {
		if (b == 0) {
			System.out.println("Error: Division by zero!");
			return 0;
		}
		return (double) a / b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean continueCalculation = true;

		while (continueCalculation) {
			System.out.println("===== Calculator Menu =====");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.print("Choose an option (1-5): ");

			int choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("Exiting Calculator. Goodbye!");
				break;
			}

			System.out.print("Enter first number: ");
			int num1 = sc.nextInt();
			System.out.print("Enter second number: ");
			int num2 = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Result: " + add(num1, num2));
				break;
			case 2:
				System.out.println("Result: " + subtract(num1, num2));
				break;
			case 3:
				System.out.println("Result: " + multiply(num1, num2));
				break;
			case 4:
				System.out.println("Result: " + divide(num1, num2));
				break;
			default:
				System.out.println("Invalid option. Try again.");
			}
		}

		sc.close();
	}
}
