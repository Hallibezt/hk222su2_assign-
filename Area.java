package hk222su_assign1;

import java.util.Scanner; 

public class Area {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		/*Why use float for radius and why can't I write decimal for pi using float? 
		 * And why do I need casting for float in area but not when using double?
		 * How does example in questions get answer with one decimal?
		 */
		System.out.print("Please enter a radius ");
		float radius = input.nextFloat();
		final double PI = 3.14592;
		double area = Math.round(radius * radius * PI * 10d) / 10d; 
		 // is there another way to customize round or to get one or no decimal ?
		System.out.print("A circle with the radius " + radius + " has the area of: " + area);
		input.close();

	}   
	                                 
}
