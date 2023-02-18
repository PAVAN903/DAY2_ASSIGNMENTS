package com.bridgelabz;

import java.util.Scanner;

public class Uc3_sum {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number....");
		int n = sc.nextInt();
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("the sum of first" + n + "natural number is" + sum);

	}

}
