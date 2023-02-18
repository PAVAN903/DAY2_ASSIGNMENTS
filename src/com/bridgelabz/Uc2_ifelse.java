package com.bridgelabz;

import java.util.Scanner;

public class Uc2_ifelse {

	public static void main(String[] args) {
		System.out.println("enter number like 0,1,10,100,1000,10,000........");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if (a == 0) {
			System.out.println("zero");
		} else if (a == 1) {
			System.out.println("one");
		} else if (a == 10) {
			System.out.println("ten");
		} else if (a == 100) {
			System.out.println("hundred");
		} else if (a == 1000) {
			System.out.println("thousand");
		} else if (a == 10000) {
			System.out.println("ten thousand");
		} else {
			System.out.println("enter valid number");
		}

	}

}
