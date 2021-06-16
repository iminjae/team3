package team3.com.kh.codingTest.Ahhye;

import java.util.Scanner;

public class coding2 {
	

        public static void b1330() {
    		Scanner sc = new Scanner(System.in);
    		int num1 = sc.nextInt();
    		int num2 = sc.nextInt();

    		if (num1 >= -10000 && num2 <= 10000) {
    			if (num1 > num2) {
    				System.out.println(">");
    			} else if (num1 < num2) {
    				System.out.println("<");
    			} else if (num1 == num2) {
    				System.out.println("==");
    			}
    		} 
    	}
        
        public static void b9498() {
    		Scanner sc = new Scanner(System.in);
    		int num1 = sc.nextInt();

    		if (num1 >= 0 && num1 <= 100) {
    			if (num1 >= 90 && num1 <= 100) {
    				System.out.println("A");
    			} else if (num1 >= 80 && num1 <= 89) {
    				System.out.println("B");
    			} else if (num1 >= 70 && num1 <= 79) {
    				System.out.println("C");
    			}else if (num1 >= 60 && num1 <= 69) {
    				System.out.println("D");
    			}else {
    				System.out.println("F");
    			}
    		} 
    	}
        
        public static void b2753() {
    		Scanner sc = new Scanner(System.in);
    		int num1 = sc.nextInt();
    			if (num1%4==0 && num1%100!=0 || num1%400==0) {
    				System.out.println("1");
    			} else {
    				System.out.println("0");
    			}
    	}
        
        public static void b14681() {
    		Scanner sc = new Scanner(System.in);
    		int x = sc.nextInt();
    		int y = sc.nextInt();
 
    			if(x>0 && y>0){
    	            System.out.println("1");
    	        }else if(x<0 && y>0){
    	            System.out.println("2");
    	        }else if(x<0 && y<0){
    	            System.out.println("3");
    	        }else if(x>0 && y<0){
    	            System.out.println("4");
    	        }    
    	}
        
		public static void b2884() {
			Scanner sc = new Scanner(System.in);
			int H = sc.nextInt();
			int M = sc.nextInt();
			
			if((M-45)<0) {
				M = (M+15);
				if((H-1) <0) {
					H = 23;
				}else {
					H = H-1;
				}
				
			}else {
	            M = M-45;
	        }
			
			System.out.println(H+" "+M);
		}
     
     

    	// 실행
    	public static void main(String[] args) {
    		b2884();

    	}
     
}
