package team3.com.kh.codingTest.jang;

import java.util.Scanner;

public class test {
	//장성현
	//1번 문제qqq
		public void method1() {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 : ");
			int N = sc.nextInt();
			
			for(int i = 1;i < 10; i++) {
				System.out.println(N + " * "+ i +" = " +(N * i));
			}
		}
		
		//2번 문제 이해xx
		public void method2() {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("입력 A : ");
			int A = sc.nextInt();
			
			System.out.println("입력 B : ");
			int B = sc.nextInt();
			
			int result = A + B;
			
			for(int i = 0;i < result; i++) {
			}
			System.out.println("result = "+result);
		}
		
		//3번 문제
		public void method3() {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 n : ");		
			int n = sc.nextInt();

			int sum = 0;
			
			for(int i = 1;i <= n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		
		
		//4번 문제 이해xx
		public void method4() {
		
			
			
			
		}
		
		//5번 문제
		public void method5() {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 t : ");		
			int t = sc.nextInt();
			
			for(int i = 1;i <= t; i++) {
				System.out.println(i);
			}
		}
		
		//6번 문제
		public void method6() {
			Scanner sc = new Scanner(System.in);
			System.out.println("입력 t : ");		
			int t = sc.nextInt();
			
			for(int i = t;i > 0; i--) {
				System.out.println(i);
			}
		}
		
}
