package team3.com.kh.codingTest.Ahhye;

import java.util.Arrays;
import java.util.Scanner;

public class javatest {
	
	public static void test() {
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void test1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		System.out.println("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		char[] arr = new char[str.length()];
		
	
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] == ch) {
				System.out.print( i + " " );
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
	}
	
	public static void test3() {
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			int num = sc.nextInt();
			
			if(num >=3 && num %2 == 1) {
				int []  arr = new int[num];
				
				for(int i=0; i < arr.length; i++) {
					if(arr.length/2) {
						
					}

				}
				
			}else {
				System.out.println("다시 입력 ");
			}
		}
	}

	public static void test4() {
		int[] arr = new int[10];
		
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		
		}
		
		
		 System.out.println();
		
		
		System.out.println(arr[0]); 
		System.out.println(arr[9]);
		
	}
	
	public static void main(String[] args) {
		test4();

	}

}
