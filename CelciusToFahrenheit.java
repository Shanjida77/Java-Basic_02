package basic1;

import java.util.Scanner;

public class CelciusToFahrenheit {
	public static void main(String args[]) {
		double celsius, fahrenheit;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter celsius degree:");
		celsius = in.nextDouble();

		fahrenheit = ((9 * celsius) / 5) + 32;
		System.out.print("Fahrenheit is: " + fahrenheit);

	}

}
