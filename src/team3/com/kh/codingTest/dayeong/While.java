package team3.com.kh.codingTest.dayeong;

import java.util.Scanner;

public class While {
	public static void q10952() {
		Scanner in = new Scanner(System.in);

		while (true) {
			int a = in.nextInt();
			int b = in.nextInt();
			int sum = a + b;
			if (a == 0 && b == 0) {
				break;
			}
			System.out.println(sum);
		}

	}

	public static void q10951() {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(a + b);
		}

	}

	public static void q1110() {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = x;
		int cnt = 0;

		while (true) {
			x = ((x % 10) * 10) + (((x / 10) + (x % 10)) % 10);
			cnt++;
			if (x == y) {
				break;
			}

		}
		System.out.println(cnt);

	}

	public static void main(String[] args) {
		// q10952();
		// q10951();
		// q1110();
	}

}
