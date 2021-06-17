package basic1;

import java.util.Scanner;

public class HrMinSec {
	public static void main(String args[]) {
		int sec, hour, min;
		Scanner in = new Scanner(System.in);

		sec = in.nextInt();

		min = sec / 60;
		hour = min / 3600;
		System.out.print("sec: " + sec + " min: " + min + " hour: " + hour);

	}

}
