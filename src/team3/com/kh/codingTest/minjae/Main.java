package team3.com.kh.codingTest.minjae;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
		
			/*
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			System.out.println((a + b)%c);
			System.out.println((a % c) + (b%c)%c);
			System.out.println((a * b)%c); 
			System.out.println((a%c)*(b%c)%c); */
			
		
		
		
			/*int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a > b) {
				System.out.println('>');
			}else if(a < b) {
				System.out.println('<');
			}else if(a == b) {
				System.out.println("==");
			}*/
			
			
			
		/*
			int a = sc.nextInt();
			
			if(a >= 90) {
				System.out.println('A');
			}else if(a >=80 && a <=89) {
				System.out.println('B');
			}else if(a >= 70 && a<=79) {
				System.out.println('C');
			}else if(a >= 60 && a <= 69) {
				System.out.println('D');
			}else {
				System.out.println('F');
			}*/
			
			/*
			int a = sc.nextInt();
			
			
			if(a%4 == 0 && a%100 != 0 || a%400 == 0) {
				System.out.println('1');
			}else {
				System.out.println('0');
			}
			*/
		/*	
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0 && y > 0) {
			System.out.println('1');
		}else if(x < 0 && y > 0) {
			System.out.println('2');
		}else if(x <0 && y< 0) {
			System.out.println('3');
		}else if(x > 0 && y < 0) {
			System.out.println('4');
		}
			*/
			
			
			
		/*
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45) {
			h = h - 1;
			m = 60 + (m -45);
			
			System.out.println(h+ " " + m);
		
			
			
		}else {
			System.out.println(h+ " " + (m-45));
			
		}
			*/
		
			
		/*
		int a = sc.nextInt();
		
		for(int i  = 1; i < 10; i++) {
			
			System.out.println(a + "*" + i + "=" + a*i );
			
			
		}
		*/	
		
		/*	
		int a = sc.nextInt();
	
		
		
		for(int i = 1; i <= a ; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
			
		}*/
			
			
		/*
		int a  = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			
			sum += i;
		}
		System.out.println(sum);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		
		
		/*
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			
			System.out.println(i);
			
		} */
			
		
		
		/*
		int a = sc.nextInt();
		
		for(int i = a; i > 0; i--) {
			System.out.println(i);
		}*/
		
		
		
		int a = sc.nextInt(); //////////////////////////////////////.////\
		
	
		
		
		for(int i = 1; i <= a ; i++) {
			
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("case #"+ i+" : "+(num1 + num2));
			
		}
		
		
		
		
		
		

	}
	
	
	
	
}
