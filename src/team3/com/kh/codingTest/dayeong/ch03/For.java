package team3.com.kh.codingTest.dayeong.ch03;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		int dan = in.nextInt();
//		if (dan >= 1 && dan <= 9) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//
//			}
//
//		}
//		int t = in.nextInt();
//
//		int sum = 0;
//
//		for (int i = 1; i <= t; i++) {
//			int num1 = in.nextInt();
//			int num2 = in.nextInt();
//
//			if (num1 > 0 && num2 < 10) {
//				sum = num1 + num2;
//				System.out.println(sum);
//				
//			}
//			
//		}
//		in.close();
//	
//	

		int n = in.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			sum += i;
		}

		System.out.println(sum);

	}

}
