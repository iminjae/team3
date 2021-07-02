package team3.com.kh.codingTest.Ahhye;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void d10952() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				break;
			} else {
				System.out.println(num1 + num2);
			}
		}
	}
	
	public static void d10951() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println(num1 + num2);
		}
	}
	
	public static void d1110() {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
		

	public static void main(String[] args) {
		d1110();
	}

}
