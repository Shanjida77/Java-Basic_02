package basic1;
import java.util.Scanner;

public class Fibonacchi {
	public static void main(String args[]) {
		int i, n, a = 0, b = 1, c = 0;
		System.out.print("Enter number: ");

		Scanner in = new Scanner(System.in);
		n = in.nextInt();

		if (n == 1)
			c = a;
		else if (n == 2)
			c = b;
		else {
			for (i = 1; i <= n; i++) {
				c = a + b;
				a = b;
				b = c;
			}

			System.out.print(c);

		}
	}

}
