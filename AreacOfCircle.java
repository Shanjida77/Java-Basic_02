package basic1;

import java.util.Scanner;

public class AreacOfCircle {
	public static void main(String args[]) {
		float r;
		double area;

		Scanner in = new Scanner(System.in);

		r = in.nextFloat();
		area = Math.PI * r * r;
		System.out.print("area:" + area);

	}

}
