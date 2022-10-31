package com.day.two;
import java.util.Scanner;
public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number");
		int num = sc.nextInt();
		int n = num;
		int result = 0; 
		for (;num > 0;)
		{
			int remainder = num % 10;
			result = (remainder + (result*10));
			num = num/10;
		}
		{
		if (result == n) {
		System.out.println(result+ " is a palindrome number");
		}
		else {
			System.out.println(result+ " is not a palindrome number");
		}
	}
	}
	}
