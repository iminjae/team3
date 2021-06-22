package team3.com.kh.codingTest.kkjtset;

//================================================//

/*
 
  1번 
 
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int a = sc.nextInt();
			
			
			for(int i = 1; i < 10; i++) {
				System.out.println(a+" * "+i+" = "+ (a*i));
			}
			
			
	
			
			
		}

	
	}
	
	
	2번 '
	
	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for (int i = 1; i <= c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}

	
	
	
	3번
	
	import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();
		int sum=0;
		for(int i =1; i <=c; i++) {
			sum +=i;
		}
		System.out.println(sum);

	}

}

	4번
	
	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i  = 0; i < num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum=a+b;
			bw.write(sum+"\n");
		}
		
		bw.flush();
		bw.close();
		
			
	}

}
	
5번 

	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		
		for(int i  = 1; i <= num; i++) {
			int a = i;
			
			bw.write(a+"\n");
		}
		
		bw.flush();
		bw.close();
		
			
	}

}

	6번   
	
	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		int t = num;
		
		for(int i  = 1; i <= num; i++) {
			
			int a = t--;
			
			bw.write(a+"\n");
		}
		
		bw.flush();
		bw.close();
		
			
	}

}
	
	
	
	7번
	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i  = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a+b;
					
			
			bw.write("Case #"+i +": "+sum +"\n");
		}
		
		bw.flush();
		bw.close();
		
			
	}

}





8


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i  = 1; i <= num; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a+b;
					
			
			bw.write("Case #"+i +": " +a+" + "+ b + " = " + sum + "\n");
		}
		
		bw.flush();
		bw.close();
		
			
	}

}



9번    


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i  = 1; i <= num; i++) {
			for(int j = 1; j<=i; j++) {
				bw.write("*");
			}
			bw.write("\n");
			
			
		
					
			
		}
		
		bw.flush();
		bw.close();
		
			
	}

}



10

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		
		for(int i  = 1; i <= num; i++) {
			for(int j = i; j<num; j++) {
				bw.write(" ");
			}
			for(int k = 1; k<=i; k++ ) {
				bw.write("*");
			}
			bw.write(" " +"\n");
			
		
					
			
		}
		
		bw.flush();
		bw.close();
		
			
	}

}





11번 


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int num = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int[] str = new int[num];
		for (int i = 0; i < str.length; i++) {
			str[i] = Integer.parseInt(st.nextToken());
		}

		for(int i =0; i < str.length; i++) {
			if(str[i] > num2-1) {
				
			}else {
				String a = String.valueOf(str[i]);
				bw.write(a +" ");
			}
		}
		bw.flush();
		bw.close();
	
		
	}

}
	
	
*/