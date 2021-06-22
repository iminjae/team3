package team3.com.kh.codingTest.Ahhye;

import java.util.Scanner;

public class Test1 {
	

        public static void a2557() {
    		System.out.println("Hello World!");
    	}
        
        public static void a10718() {
             System.out.println("강한친구 대한육군");
             System.out.println("강한친구 대한육군");
    	}
        
        public static void a10171() {
        	System.out.println("\\    /\\");
        	System.out.println(") )  ( ')");
        	System.out.println("(  /  ) ");
        	System.out.println(" \\(__)|");
        	
        }
        
        
        public static void a10172() {
        	System.out.println("|\\_/|");
        	System.out.println("|q p|   /}");
        	System.out.println("( 0 )\"\"\"\\");
        	System.out.println("|\"^\"`    |");
        	System.out.println("||_/=\\\\__|");
        }
        
        public static void a1000() {
        	//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        	Scanner sc= new Scanner(System.in);
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	
        	if(num1 > 0 && num2 <10) {
        		System.out.println(num1 + num2);
        	}
        	
        }
        
        public static void a1001() {
        	//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        	Scanner sc= new Scanner(System.in);
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	
        	if(num1 > 0 && num2 <10) {
        		System.out.println(num1 - num2);
        	}
        	
        }
        
        public static void a10998() {
        	Scanner sc= new Scanner(System.in);
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	
        	if(num1 > 0 && num2 <10) {
        		System.out.println(num1 * num2);
        	}
        	
        }
      
        public static void a10008() {
        	Scanner sc= new Scanner(System.in);
        	double num1 = sc.nextInt();
        	double num2 = sc.nextInt();
        	
        	if(num1 > 0 && num2 <10) {
        		System.out.println(num1/num2);
        	}
        	
        }
        
        public static void a10869() {
        	Scanner sc= new Scanner(System.in);
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	
        	if(num1 >= 0 && num2 <=10000) {
        		System.out.println(num1+num2);
        		System.out.println(num1-num2);
        		System.out.println(num1*num2);
        		System.out.println(num1/num2);
        		System.out.println(num1%num2);
        	}
        	
        }
        
        public static void a10430() {
        	Scanner sc= new Scanner(System.in);
        	int num1 = sc.nextInt();
        	int num2 = sc.nextInt();
        	int num3 = sc.nextInt();
        	
        	if(num1 >= 2 && num2 <=10000) {
        		System.out.println((num1+num2)%num3);
        		System.out.println(((num1%num3) + (num2%num3))%num3);
        		System.out.println((num1*num2)%num3);
        		System.out.println(((num1%num3) * (num2%num3))%num3);
        	
        	}
        }
      
        public static void a2588() {
        	Scanner sc= new Scanner(System.in);
        	int a = sc.nextInt();
        	sc.nextLine();
        	String b = sc.nextLine();
        	
        	System.out.println(a*(b.charAt(2) - '0'));
        	System.out.println(a*(b.charAt(1) - '0'));
        	System.out.println(a*(b.charAt(0) - '0'));
        	System.out.println(a*Integer.parseInt(b));
        	
        }
     

    	// 실행
    	public static void main(String[] args) {
    		a2588();

    	}
     
}
