package team3.com.kh.codingTest.ms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CT_03 {

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);

		// 1. 입력받은 숫자 구구단 출력
		/*-
		int num1 = sc.nextInt();
		
		for (int i =1 ; i<=9; i++) {
			System.out.println(num1+" X "+i+" = "+ i*num1);
		*/

		// 2. 입력받은 수 만큼 계산
		/*
		 * int count=sc.nextInt();
		 * 
		 * for (int i=0;i<count;i++) { int a=sc.nextInt(); int b=sc.nextInt();
		 * System.out.println(a+b);
		 * 
		 * 
		 */

		// 3. 입력받은 수 까지의 합
		/*
		 * int num = sc.nextInt(); int result=0; for (int i=1; i<=num;i++) { result +=i;
		 * } System.out.println(result);
		 */
		// 4. for 문하다가 갑자기 Buffered?

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 * StringTokenizer st; int num = Integer.parseInt(br.readLine());
		 * 
		 * 
		 * for(int i = 0; i < num; i++) { st = new StringTokenizer(br.readLine());
		 * 
		 * int a = Integer.parseInt(st.nextToken()); int b =
		 * Integer.parseInt(st.nextToken()); int sum=a+b; bw.write(sum+"\n"); }
		 * 
		 * bw.flush(); bw.close();
		 */
		// 5. 입력 받은 수 까지 출력
		/*
		 * int num =sc.nextInt(); for (int i=1; i<=num;i++) { System.out.println(i); }
		 */
		// 6. 입력 받은 수 부터 1까지 출력
		/*
		 * int num2=sc.nextInt(); for (int i=num2; i>=1;i--) { System.out.println(i); }
		 */

		// 7 a+b
		/*
		 * int count=sc.nextInt();
		 * 
		 * for (int i=1;i<=count;i++) { int a=sc.nextInt(); int b=sc.nextInt();
		 * System.out.println("Case #"+i+": "+(a+b));
		 * 
		 * 
		 * }
		 */

		// 8 a+b
		/*
		 * int count2=sc.nextInt();
		 * 
		 * for (int i=1;i<=count2;i++) { int a=sc.nextInt(); int b=sc.nextInt();
		 * System.out.println("Case #"+i+": "+a+" + "+b+" = "+(a+b));
		 * 
		 * 
		 * }
		 */

		// 9 별 찍기
		/*
		 * for (int i =0;i <5 ;i++) { for (int j =0; j<=i; j++){ System.out.print("*");
		 * } System.out.println(); }
		 * 
		 */
		// 10번 별찍기
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j >= 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// 11

		int count3 = sc.nextInt();

		int max = sc.nextInt();
		int num[] = new int[count3];
		for (int i = 0; i < count3; i++) {
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < count3; i++) {
			if (num[i] < max) {
				System.out.print(num[i] + " ");
			}
		}
		
		
	}

}
