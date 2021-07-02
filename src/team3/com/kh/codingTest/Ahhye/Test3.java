package team3.com.kh.codingTest.Ahhye;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Test3 {
	

        public static void C2739() {
    		Scanner sc = new Scanner(System.in);
    		
    		int dan = sc.nextInt();
    		
    		for(int i=1; i<=9; i++) {
    			System.out.println( dan + " * " + i   + " = " + (dan*i));
    		}
    	}
        
        public static void c10950() {
    		Scanner sc = new Scanner(System.in);
//    		int num = sc.nextInt();
//    		
//    		int [] arr1 = new int [num];
//    		int [] arr2 = new int [num];
//    		
//    		for(int i=0; i<num; i++) {
//    			int  num1 = sc.nextInt();
//    			int  num2 = sc.nextInt();
//    			arr1[i] = num1;
//    			arr2[i] = num2;
//    		}
//    		
//    		for(int i=0; i<num; i++) {
//    			System.out.println(arr1[i] + arr2[i]);
//    		}
    		int t = sc.nextInt();
    		int i;
    		for(i=0; i<t; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			System.out.println(a+b);
    		}

    	
    	}
        
        public static void c8393() {
    		Scanner sc = new Scanner(System.in);
    		int num1 = sc.nextInt();
    		
    		int [] arr = new int[num1];
    		int sum =0;
    		for(int i=0; i <arr.length; i++) {
    			arr[i] = i+1;
    			sum += i+1;
    		}
    		
    		System.out.println(sum);
    	}
        
        public static void c15552() {
        	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
               BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
             try {
          
               int n;
             
                n = Integer.parseInt(bf.readLine());
                
                 for(int i = 0; i < n; i++){
                         String s = bf.readLine();
                         int a = Integer.parseInt(s.split(" ")[0]);
                         int b = Integer.parseInt(s.split(" ")[1]);
                         bw.write(a+b+"\n");
                 }   
                 
                 bw.flush();
                         
             } catch (NumberFormatException | IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
             }finally {
                  
                  try {
                   bw.close();
                   bf.close();
                } catch (IOException e) {
                   // TODO Auto-generated catch block
                   e.printStackTrace();
                }
             }

    		
    		
        }
    	
        
        public static void c2741() {
			Scanner sc = new Scanner(System.in);
		
			int num1 = sc.nextInt();

    		for(int i=1; i <=num1; i++) {
    			System.out.println( i);
    		}
		}
		
		public static void c2742() {
			Scanner sc = new Scanner(System.in);
		
			int num1 = sc.nextInt();

    		for(int i= num1; i >= 1; i--) {
    			System.out.println( i);
    		}
		}
		
		public static void c11021() {
			Scanner sc = new Scanner(System.in);
		
			int t = sc.nextInt();
    		int i = 1;;
    		for(i=1; i<=t; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			System.out.println( "Case #" + i + ": " + (a+b));
    		}
		}
		
		public static void c11022() {
			Scanner sc = new Scanner(System.in);
		
			int t = sc.nextInt();
    		int i = 1;;
    		for(i=1; i<=t; i++) {
    			int a = sc.nextInt();
    			int b = sc.nextInt();
    			System.out.println( "Case #" + i + ": " + a + " + " + b + " = " + (a+b));
    		}
		}
		
		public static void c2438() {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			for(int i=1; i <=num; i++) {
				for(int j=1; j <= i; j++) {
					System.out.print( "*");
				}
				System.out.println();
			}
			
		}
		
		
		
		public static void c2439() {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			for (int i = 1; i <= 5; i++) {
				for (int j = 5; j >= 0; j--) {
					if (j < i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		
		public static void c10871() {
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int num = sc.nextInt();
			
			int[] arr = new int[size];
			
			for(int i=0; i < size; i++) {
				int random = sc.nextInt();
				
				arr[i] = random;
			}
			
			for(int i=0; i < size; i++) {				
				if(num > arr[i]) {
					System.out.print(arr[i] + " ");
				}				
			}
		}
		
		
     


    	// 실행
    	public static void main(String[] args) {
    		c10871();

    	}
     
}
