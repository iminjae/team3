package team3.com.kh.codingTest.ms;

import java.util.Scanner;

public class CT_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Hello World!를 출력하시오.
		System.out.println("Hello World!");

		// 2. 두 줄에 걸쳐 "강한친구 대한육군"을 한 줄에 한 번씩 출력한다.
		System.out.println("강한친구 대한육군\n" + "강한친구 대한육군");

		// 3. 고양이를 출력하시오
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");

		// 4. 개를 출력하시오
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");

		// 5. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);

		// 6. 두 정수 a와 b를 입력받은 다음, a-b를 출력하는 프로그램을 작성하시오.
		System.out.println(a - b);

		// 7. 두 정수 a와 b를 입력받은 다음, a*b를 출력하는 프로그램을 작성하시오.
		System.out.println(a * b);

		// 8. 두 정수 a와 b를 입력받은 다음, a/b를 출력하는 프로그램을 작성하시오.
		System.out.println(a / b);

		// 9. 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		/*
		 * 10. (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		 * 
		 * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		 * 
		 * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		 */

		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();

		System.out.println((d + e) % f);
		System.out.println(((d % f) + (e % f)) % f);
		System.out.println((d * e) % f);
		System.out.println(((d % f) * (e % f)) % f);

		int g = sc.nextInt();
		int h = sc.nextInt();

		System.out.println(g * (h % 10));
		System.out.println(g * (h % 100 - (h % 10)) / 10);
		System.out.println(g * (h - (h % 100)) / 100);
		System.out.println(g * h);

	

	}

}
