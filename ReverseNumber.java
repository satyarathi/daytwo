package com.day.two;

public class ReverseNumber {
public static void main(String[] args) {
	int num = 231;
	int reminder = 0;
	int result=0;
	while (num > 0) {
		reminder = num % 10;
		num = num/10;
		result =( reminder + (result*10));	
	}
	System.out.println("reverse of num is:" +result);
}
}
