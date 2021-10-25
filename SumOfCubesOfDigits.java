package lab1.excercise1;

/*
 * Create a method to find the sum of the cubes of the digits of an n digit number
 */

import java.util.Scanner;

public class SumOfCubesOfDigits {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number to sum of cubes: ");
		int num = scn.nextInt();
		System.out.println("Sum of the cubes of the digits of the number " + num + " is: " + displaySum(num));

		scn.close();

	}

	// create a method to find sum of cubes of digit
	public static int displaySum(int num) {

		int sum = 0;

		while (num != 0) {

			int digit = num % 10;
			sum = sum + (int) Math.pow(digit, 3);
			num /= 10;
		}
		return sum;
	}

}
