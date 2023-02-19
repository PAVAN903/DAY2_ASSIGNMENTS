package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter  number");
		int number = sc.nextInt();
		int reverse = 0;
		for (int temp = number; temp != 0; temp /= 10) {
			int digit = temp % 10;
			reverse = reverse * 10 + digit;
		}
		if (number == reverse) {
			System.out.println(number + " is palindrome number");
		} else {
			System.out.println(number + " is not palindrome number");
		}

	}

}
