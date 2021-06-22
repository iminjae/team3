package team3.com.kh.codingTest.ms;

import java.util.Scanner;

public class CT_03 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		// 1. 입력받은 숫자 구구단 출력
		/*-
		int num1 = sc.nextInt();
		
		for (int i =1 ; i<=9; i++) {
			System.out.println(num1+" X "+i+" = "+ i*num1);
		*/
		
		// 2. 입력받은 수 만큼 계산
		/*
		int count=sc.nextInt();
		
		for (int i=0;i<count;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);	
			
		}
		*/
		
		// 3. 입력받은 수 까지의 합
		/*
		int num = sc.nextInt();
		int result=0;
		for (int i=1; i<=num;i++) {
			result +=i; 
		}
		System.out.println(result); 	
		*/
		// 4. for 문하다가 갑자기 Buffered?
		int count=sc.nextInt();
		
		for (int i=0;i<count;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);	
			
		}
		// 5. 입력 받은 수 까지 출력
		/*
		int num =sc.nextInt();
		for (int i=1; i<=num;i++) {
			System.out.println(i);
		}
		*/
		// 6.  입력 받은 수 부터 1까지 출력
		/*
		int num2=sc.nextInt();
		for (int i=num2; i>=1;i--) {
			System.out.println(i);
		}
		*/
		
	}

}
