package team3.com.kh.codingTest.jang;

import java.util.Scanner;

public class BACKJOON_04_while {

	public void method1() {
		// 1번 : 두 정수 a와 b를 입력받은 후 a + b를 출력 , 입력의 마지막에 0 두 개가 들어온다.

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("a : ");
			int a = sc.nextInt();

			System.out.print("b : ");
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				sc.close();
				break;
			}
			System.out.println("A+B = " + (a + b));
		}
	}

	public void method2() {
		// 2번 : 두 정수 A와 B를 입력받은 다음, A+B를 출력

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("a : ");
			int a = sc.nextInt();

			System.out.print("b : ");
			int b = sc.nextInt();

			System.out.println("A+B = " + (a + b));

		}
	}

	public void method3() {
		/*
		 * 3번 : 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작으면
		 * 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음 주어진 수의 가장 오른쪽 자리수와 앞에서 구한 합의 가장 오른쪽
		 * 자리 수을 이어 붙이면 새로운 수를 만들 수 있다. 26부터 시작한다. 2+8 = 8 이다. 새로운 수는 68이다.6+8 = 14이다.
		 * 새로운 수는 84이다.8+4=12이다. 새로운 수는 42이다.4+2=6 새로운 수는 26이다.
		 */ 

		Scanner sc = new Scanner(System.in);

	}

	// 실행
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BACKJOON_04_while bj = new BACKJOON_04_while();
		bj.method2();
	}

}
