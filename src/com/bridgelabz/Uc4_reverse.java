package com.bridgelabz;

import java.util.Scanner;

public class Uc4_reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int reverse=0;
		
		while(number!=0) {
			int digit=number%10;
			reverse=reverse*10+digit;
			number/=10;
		}
		System.out.println("reversed number::"+reverse);

	}

}
