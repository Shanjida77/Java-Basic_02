package basic1;

import java.util.Scanner;

public class LcmHcf {
	public static void main(String args[]) {
		int a, b, lcm, hcf = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number:");
		a = in.nextInt();
		System.out.print("Input Second number:");
		b = in.nextInt();

		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && b % i == 0) {
				hcf = i;
			}
		}
		lcm = (a * b) / hcf;
		System.out.print("Hcf = " + hcf + "\n Lcm = " + lcm);

	}

}
