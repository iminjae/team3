package team3.com.kh.codingTest.minjae;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			/*//while-1
			while(true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				
				if(a==0 && b==0) {
					break;
				}else {
					System.out.println(a+b);
				}
					
				
			} */
			
			
			//while-2
			
			int a = sc.nextInt();
			int count = 0;
			
			
			
			while(true) {
				
				/*
				int front = a % 10; //ㅇ 입력받은수앞  2
				int back = a / 10; // 입력받은수 뒤 6
				
				int result = front + back; //합친값  8
				
				int resultBack = result /10;//깂 뒤 8
				
				int result2 = (resultBack * 10) + (result /10);//값뒤 6 + result8
				*/
				
				
				a = ((a % 10 * 10) + ((a/10)+(a%0)) % 10);
				
				count++;
				
				
				
				int result = a;
				
			
				
				
				
				if(result == a ) {
				
				break;
				
			}
			
			
		}
			System.out.println(count);
	}
}
