package hk222su_assign1;

import java.util.Scanner;

public class SumOfThree {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter three digit number: ");
		int number = input.nextInt();
		
		int number1 = number / 100;
		int number2 = number / 10;
		int number2f = number2 % 10;
		int number3 = number % 10; 				
		int sumOfNumbers = number1+ number2f + number3;		
		System.out.print("The sum of the digits is: " + sumOfNumbers);		
		input.close();

	}
}

