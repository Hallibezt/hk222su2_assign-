package hk222su_assign1;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter temperature in celcius: ");
		double temp = input.nextDouble();
		if (temp <= 10) {
			System.out.print("Please, enter wind in m/s: ");
			double wind = input.nextDouble();
			if (wind > 1.3) {						
				double windchill = 13.12 + (0.6215 * temp) - (11.37 * Math.pow(wind, 0.16)) + (0.3965 * temp * Math.pow(wind, 0.16));
				double windchillf = Math.round(windchill *10d) / 10d;
				System.out.print("The windchill is: " + String.format("%.1f", windchillf));
			}
			else 
				System.out.print("Sorry, this calculator only works for wind above 1.3 m/s");				
		}
		else 
			System.out.print("Sorry this calculator only works for temperature at or below 10 degree celsius");			
		
		input.close();
		
	}

}
