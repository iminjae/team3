package team3.com.kh.codingTest.dayeong.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class For {

	public static void main(String[] args) { //throws IOException
		Scanner in = new Scanner(System.in);
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
//        int n = Integer.parseInt(bf.readLine());
//        for(int i = 0; i < n; i++){
//            String s = bf.readLine();
//            int a = Integer.parseInt(s.split(" ")[0]);
//            int b = Integer.parseInt(s.split(" ")[1]);
//            bw.write(a+b+"\n");
//        }
//        bw.flush();

//		
//		int n = in.nextInt();
//		for(int i = 1; i <= n ; i ++) {
//			System.out.println(i);
//		}

		
		int n = in.nextInt();
		for(int i = n; i >= 1 ; i--) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
