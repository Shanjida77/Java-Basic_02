package basic1;

import java.util.Scanner;

public class PoundToKilogram {
	public static void main(String args[]) {
		double pound, kg;

		Scanner in = new Scanner(System.in);
		System.out.print("Enter pounds: ");
		pound = in.nextDouble();

		kg = pound / 2.205;
		System.out.print("Kilogram is: " + kg);

	}

}
