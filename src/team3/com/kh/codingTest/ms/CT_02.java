package team3.com.kh.codingTest.ms;

import java.util.Scanner;

public class CT_02 {

	public static void main(String[] args) {

//		01. 첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//		A가 B보다 큰 경우에는 '>'를 출력한다.
//		A가 B보다 작은 경우에는 '<'를 출력한다.
//		A와 B가 같은 경우에는 '=='를 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		} else if (a<b) {
			System.out.println("<");
		} else {
			System.out.println("=");
		}
			
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.
	
		int score = sc.nextInt();
		if (score >=90) {	
			System.out.println('A');
		} else if (score >=80) {
			System.out.println('B');
		} else if (score >=70) {
			System.out.println('C');
		} else if (score >=60) {
			System.out.println('D');
		} else {
			System.out.println('F');
		}
			
		/*
		연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.

		윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.

		예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다. 
		1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다. 
		하지만, 2000년은 400의 배수이기 때문에 윤년이다.
		*/
		
		int year = sc.nextInt();
		if( (year%4==0) && (year%100!=0) || year%400==0 ) {
			System.out.println(1);
			
		}else
			System.out.println(0);
		
		// 04. 주어진 점이 어느 사분면에 속하는지 알아내는 것이다. //사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다.
		// "Quadrant n"은 "제n사분면"이라는 뜻이다.

		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = 0;
		if (x > 0 && y > 0)
			result = 1;
		if (x < 0 && y > 0)
			result = 2;
		if (x < 0 && y < 0)
			result = 3;
		if (x > 0 && y > 0)
			result = 4;
		System.out.println(result + "분면");

		// 05 첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (min - 45 < 0) {
			if (hour == 0) {
				hour = 23;
			} else {
				hour = hour - 1;
			}
			min = min + 15;
		} else if (min >= 45) {
			min = min - 45;
		}

		System.out.println(hour + "시" + min + "분");
	}
	

}
