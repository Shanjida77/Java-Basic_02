package basic1;
public class Prime {
	public static void main(String args[]) {
		int n = 1;
		int count = 0;

		System.out.println("Print prime from 1 to 100: ");

		for (n = 1; n <= 100; n++) {
			count = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(n);
			}
		}

	}

}
