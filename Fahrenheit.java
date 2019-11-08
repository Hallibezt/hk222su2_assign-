package hk222su_assign1;

import java.util.Scanner;

public class Fahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a temperature in Fahrenheit ");
		double fahrenheit = input.nextDouble();
		System.out.print("The entered temperature in Celcius is: ");
		System.out.print((fahrenheit - 32) * 5/9);
		input.close();

	}

}