package team3.com.kh.codingTest.jang;

import java.util.Scanner;

public class BACKJOON_03_For {
	// 장성현
	// 1번 문제
	public void method1() {

		Scanner sc = new Scanner(System.in);
		System.out.println("입력 : ");
		int N = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));
		}
	}

	// 2번 문제 이해xx
	public void method2() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int result = 0;

		for (int i = 0; i < num; i++) {

			System.out.println("입력 A : ");
			int A = sc.nextInt();

			System.out.println("입력 B : ");
			int B = sc.nextInt();

			result = A + B;

			System.out.println("result = " + result);
		}

	}

	// 3번 문제
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 n : ");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	// 4번 문제 이해xx
	public void method4() {

	}

	// 5번 문제
	public void method5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 t : ");
		int t = sc.nextInt();

		for (int i = 1; i <= t; i++) {
			System.out.println(i);
		}
	}

	// 6번 문제
	public void method6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 t : ");
		int t = sc.nextInt();

		for (int i = t; i > 0; i--) {
			System.out.println(i);
		}
	}

	// 7번 문제 : 정수 A와 B를 입력받은 다음 A+B를 출력
	// 각 테스트 케이스마다 "Case #x: "를 출력한 다음,
	// A+B를 출력한다. 테스트 케이스 번호는 1부터 시작

	public void method7() {
		Scanner sc = new Scanner(System.in);

		System.out.println(" T : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			System.out.println(" A 입력 : ");
			int A = sc.nextInt();
			System.out.println(" B 입력 : ");
			int B = sc.nextInt();

			sum = A + B;

			System.out.println("case #" + i + ": " + sum);

		}

	}

	// 8번 문제
	// 각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다.
	// x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

	public void method8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("T : ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {

			System.out.println(" A 입력 : ");
			int A = sc.nextInt();
			System.out.println(" B 입력 : ");
			int B = sc.nextInt();

			sum = A + B;

			System.out.println("case #" + i + ": " + A + " + " + B + " = " + sum);

		}
	}

	// 9번 문제 : 별 찍기
	// 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

	public void method9() {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력 :");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// 10번 문제 : 별 반대로 찍기
	// 첫째 줄부터 N번째 줄까지 차례대로 오른쪽 정렬하여 별을 출력한다.

	public void method10() {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력 :");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	// 11번 문제 : xx

	public void mehtod11() {

		Scanner sc = new Scanner(System.in);

	}

}
