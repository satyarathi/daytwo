package com.day.two;

public class ForReverse {
	public static void main(String[] args) {
		int num = 231,result = 0;
		for (;num > 0;)
		{
			int remainder = num % 10;
			result = (remainder + (result*10));
			num = num/10;
		}
		System.out.println("Reverse of num is: " +result);
	}

}
