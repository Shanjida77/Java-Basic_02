package basic1;

import java.util.Scanner;

public class FeetToMeter {
	public static void main(String args[]) {
		double feet, meter;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter feet: ");
		feet = in.nextDouble();

		meter = feet / 3.281;
		System.out.print("Meter is: " + meter);

	}

}
