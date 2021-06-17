package basic1;

import java.util.Scanner;

public class Tax {
	public static void main(String args[]) {
		double cost, amount, vat = 0.06;
		Scanner in = new Scanner(System.in);

		cost = in.nextDouble();

		amount = cost + ((cost * vat) / 100);
		System.out.print("cost: " + cost + " amount: " + amount);

	}

}
