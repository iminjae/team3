/////1번
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		
		do {
			st = new StringTokenizer(br.readLine());
			
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) {
				break;
			}
			
			
			
			
			int result = a + b;
			
			bw.write(result + "\n");
			
		}while(true);
		
		bw.flush();
		bw.close();
        
		
		
	}

}


/////2번 //////////////

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = null;
		int a =0;
		int b=0;
		
		do {
			try {
				st = new StringTokenizer(br.readLine());
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
			}catch(Exception o) {
				break;
			}
			
			
			
			
			
			
			
			
			int result = a + b;
			
			bw.write(result + "\n");
			
		}while(true);
		
		bw.flush();
		bw.close();
		
		
	}

}

//////33333

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = null;

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());

		int count = 0;
		int b, c, d, e, f;

		if (a < 10) {
			a *= 10;
		}

		int temp = a;

		while (true) {
			count++;

			b = a / 10; // 십의 자리 수 받기
			c = a % 10; // 일의 자리수 받기
			d = a + b;
			if (d >= 10) {
				e = d % 10;
				f = (c * 10) + e;
			} else {
				e = d;
				f = (c * 10) + e;
			}
			a = f;

			if (f == temp) {
				String t = String.valueOf(count);
				bw1.write(t);
				break;
			}

		}

		bw1.flush();
		bw1.close();

	}

}

