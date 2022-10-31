package com.day.two;

import java.util.Scanner;
class OneTensHundred {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int thousands = 0;
		int hundreds = 0;
		int tens = 0;
		int ones = 0;

		System.out.print("Enter a 4 digit number: ");
		int n = input.nextInt();

		if (n <= 9999 && n > 1)   
		{

			thousands = (n/1000);
			System.out.println("Thousands place digit: " + thousands);

			hundreds = (n / 100)%10;
			System.out.printf("Hundreds place digit: " + hundreds);

			tens = (n/10) % 10;  
			System.out.printf("\nTens place digit: " + tens);

			ones = (n%10);   
			System.out.printf("\nOnes place digit: " + ones);   
		}

//		//else                                                                    
//		{      
//			if (n > 1000)
//				System.out.println("\nError! Number more then 4 digits.");
//			if (n < 1)
//				System.out.println("Error! Number less then 4 digits.");
//		}



	}
}