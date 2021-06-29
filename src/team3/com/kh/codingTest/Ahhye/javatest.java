package team3.com.kh.codingTest.Ahhye;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class javatest {
	
	public static void method6() {

		// Scanner 이용해서 국어 점수와 영어점수를 3번찍어서 각각 평균을 구하시오
		double[][] arr = new double[2][4];

		Scanner sc = new Scanner(System.in);

		int arrIlgth = 0;

		double sum = 0; // 왜for안인지 바깥이 아니라 안인건지 // 이유는 영어점수에 국어점수가 누적됌 0으로 다시 세팅해야함

		for (int i = 0; i < arr.length; i++) {

			arrIlgth = arr[i].length - 1;
			for (int j = 0; j < arr[i].length - 1; j++) {

				if (i == 0) {
					System.out.println("국어점수 : ");
				} else {
					System.out.println("영어점수 : ");
				}

				arr[i][j] = sc.nextDouble();

				sum += arr[i][j];
			}

			arr[i][arrIlgth] = sum;
		}

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print("  arr[" + i + "]" + "[" + j + "]  :  " + arr[i][j]);
			}

			System.out.println();

		}

		DecimalFormat f1 = new DecimalFormat("0.00");

		System.out.println("국어점수 평균 : " + arr[0][arrIlgth] / arrIlgth);
		System.out.println("영어점수 평균 : " + arr[1][arrIlgth] / arrIlgth);

		System.out.println("영어점수 평균 : " + f1.format(arr[1][arrIlgth] / arrIlgth));

	}
	
	public static void method7() {
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][4];
		
		//합계 변수
		int kosum = 0;
		int ensum = 0;
		//평균값 나눌 과목의 개수 변수
		int length = 0;
		
		//초기화
		for(int i=0; i <arr.length; i++) {
			for(int j=0; j <arr[i].length-1; j++) {
				//평균값 나눌 과목의 개수 저장
				length = arr[i].length-1;
				
				if(i==0) {
					System.out.println("국어점수 : ");
					arr[0][j]=sc.nextDouble();
					kosum += arr[0][j];
					
				}else {
					System.out.println("영어점수 : ");
					arr[1][j]=sc.nextDouble();
					ensum += arr[1][j];
				}
				
				arr[0][3] = kosum;
				arr[1][3] = ensum;
			}
		}
		
		//출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("  arr[" + i + "]" + "[" + j + "]  :  " + arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("국어점수 평균 : " + arr[0][3] /length );
		System.out.println("영어점수 평균 : " + arr[1][3] /length );
		
	}
	
	public static void main(String[] args) {
		method7();

	}

}
