package team3.com.kh.codingTest.ms;

import java.util.Scanner;

public class CT_04 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int a;
			int b;
			int num1;
			int num2;
			int temp=0;
			int count=0;
			/*
		while(true) {
			a=sc.nextInt();
			b=sc.nextInt();
			if(a==0 && b==0) break;
			System.out.println(a+b);
		}
		int i=0;
		while(i<5) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(a+b);
			i++;
		}
		
		*/
	/*		
		0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
		
		먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 
		
		그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 
		다음 예를 보자.

		26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다.
		
		새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

		위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.

		N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
	*/
		a=sc.nextInt();
		if ( a<10) {
			num1=0;
			num2=a;
		} else {
			num1= a/10;
			num2= a%10;
		}
		System.out.println(num1);
		System.out.println(num2);
		while(a!=temp) {
			temp= num2*10+((num1+num2)%10);
			System.out.println(temp);
			
			num1=temp/10;
			num2=temp%10;
			
			count++;
		}
		
		System.out.println(count);
			
	}
	
	
	
}
