package basic1;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String args[]) {
		int n, i, rem, sum = 0;

		System.out.print("Enter number: ");
		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		i = 0;
		while (n != 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
			i++;
		}
		System.out.print("Sum of digits is: " + sum);
	}

}
