package com.bridgelabz;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr alphabet to check whether it is a vowels or consonants");
		char a=sc.next().charAt(0);
		switch(a) {
		case 'a':
			System.out.println(a+ " vowel");
			break;
		case 'e':
			System.out.println(a+ " vowel");
			break;
		case 'i':
			System.out.println(a+ " vowel");
			break;
		case 'o':
			System.out.println(a+ " vowel");
			break;
		case 'u':
			System.out.println(a+ " vowel");
			break;
			default:
				System.out.println(a+ " is consonant");
			
			
		
			
		}

	}

}
