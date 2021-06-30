package team3.com.kh.codingTest.dayeong.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class For {

	public static void q11021() {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			int b = in.nextInt();
			int c = in.nextInt();

			System.out.println("Case #" + i + ": " + (b + c));
		}

		in.close();

	}

	public static void q11022() {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			int b = in.nextInt();
			int c = in.nextInt();

			System.out.println("Case #" + i + ": " + b + " + " + c + " = " + (b + c));
		}

		in.close();

	}

	public static void q2438() {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}

	public static void q2439() {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		in.close();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void q10871() {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			int random = in.nextInt();
			arr[i] = random;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]< x) {
				System.out.print(arr[i]+" ");
			}
		}	
	}
	
	public static void main(String[] args) { // throws IOException
		// q11021();
		// q11022();
		// q2438();
		// q2439();
		q10871();

//		Scanner in = new Scanner(System.in);
//		int dan = in.nextInt();
//		if (dan >= 1 && dan <= 9) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.println(dan + " * " + i + " = " + dan * i);
//
//			}
//
//		}
//		int t = in.nextInt();
//
//		int sum = 0;
//
//		for (int i = 1; i <= t; i++) {
//			int num1 = in.nextInt();
//			int num2 = in.nextInt();
//
//			if (num1 > 0 && num2 < 10) {
//				sum = num1 + num2;
//				System.out.println(sum);
//				
//			}
//			
//		}
//		in.close();
//	
//	

//		int n = in.nextInt();
//		int sum = 0;
//
//		for (int i = 1; i <= n; i++) {
//
//			sum += i;
//		}
//
//		System.out.println(sum);

//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		try {
//	
//        int n;
//		
//			n = Integer.parseInt(bf.readLine());
//			
//			 for(int i = 0; i < n; i++){
//		            String s = bf.readLine();
//		            int a = Integer.parseInt(s.split(" ")[0]);
//		            int b = Integer.parseInt(s.split(" ")[1]);
//		            bw.write(a+b+"\n");
//			 }   
//			 
//			 bw.flush();
//		            
//		} catch (NumberFormatException | IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//	        
//	        try {
//				bw.close();
//				bf.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//        
//        
//		
//		int n = in.nextInt();
//		for(int i = 1; i <= n ; i ++) {
//			System.out.println(i);
//		}

//		
//		int n = in.nextInt();
//		for(int i = n; i >= 1 ; i--) {
//			System.out.println(i);
//		}
//		

	}

}
