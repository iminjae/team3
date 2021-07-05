package team3.com.kh.codingTest.kkjtset;

public class onechaArrays {

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

			int num = Integer.parseInt(br.readLine());

			int[] arr = new int[num];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int min = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}

			}
			/// 최대s
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
				}

			}
			bw.write(String.valueOf(min) + " ");

			bw.write(String.valueOf(max));

			bw.flush();
			bw.close();

		}

	}
	
	
	//////2222///////////////////////////
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

			int[] arr = new int[9];

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
			}
			int key = 1;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == max) {
					key +=i;
					break;
				}
			}

			bw.write(max + "\n");
			bw.write(String.valueOf(key));

			bw.flush();
			bw.close();
		}

	}

	
	
//////////3/33333////////////////
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.StringTokenizer;

	public class Main {

		public static void main(String[] args) throws IOException {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;

			int num1 = Integer.parseInt(br.readLine());
			int num2 = Integer.parseInt(br.readLine());
			int num3 = Integer.parseInt(br.readLine());

			String result = String.valueOf((num1 * num2 * num3));

			String[] t = result.split("");

			int count = 0;
			int count1 = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			int count5 = 0;
			int count6 = 0;
			int count7 = 0;
			int count8 = 0;
			int count9 = 0;

			for (int i = 0; i < t.length; i++) {
				if (t[i].equals("0")) {

					count++;
				}
				if (t[i].equals("1")) {
					count1++;
				}
				if (t[i].equals("2")) {
					count2++;
				}
				if (t[i].equals("3")) {
					count3++;
				}
				if (t[i].equals("4")) {
					count4++;
				}
				if (t[i].equals("5")) {
					count5++;
				}
				if (t[i].equals("6")) {
					count6++;
				}
				if (t[i].equals("7")) {
					count7++;
				}
				if (t[i].equals("8")) {
					count8++;
				}
				if (t[i].equals("9")) {
					count9++;
				}
			}
			bw.write(String.valueOf(count + "\n"));
			bw.write(String.valueOf(count1 + "\n"));
			bw.write(String.valueOf(count2 + "\n"));
			bw.write(String.valueOf(count3 + "\n"));
			bw.write(String.valueOf(count4 + "\n"));
			bw.write(String.valueOf(count5 + "\n"));
			bw.write(String.valueOf(count6 + "\n"));
			bw.write(String.valueOf(count7 + "\n"));
			bw.write(String.valueOf(count8 + "\n"));
			bw.write(String.valueOf(count9));

			bw.flush();
			bw.close();

		}
	}
	
	
	/////////4444444444/////////
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.StringTokenizer;

	public class Main {

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;

			int[] arr = new int[10];
			int count = 10;
			// 42로 나눈 거 입력
			for (int i = 0; i < arr.length; i++) {
				arr[i] = (Integer.parseInt(br.readLine()) % 42);
			}
			
			for (int i = 0; i < arr.length; i++) {
				int temp=1000;
				for (int j = 0; j < i; j++) {
					if (arr[i] == arr[j]) {
						if(temp == arr[i]) {
							break;
						}
						count--;
						temp = arr[i];
					}
				}
				
			}
			bw.write(String.valueOf(count));
			bw.flush();
			bw.close();
		}

	}

	
	
	///5////////555555/////
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.StringTokenizer;

	public class Main {

		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;

			int num = Integer.parseInt(br.readLine());
			double[] arr = new double[num];
			
			double a = 0;

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			double max = arr[0];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < i; j++) {
					if (arr[i] >  max) {
						max = arr[i];

					}

				}
				
			}

			for (int i = 0; i < arr.length; i++) {
				
					a+= (arr[i] / max )* 100;
					
				}
			
			

			a  = a/num;
			bw.write(String.valueOf(a));
			bw.flush();
			bw.close();

		}

		
		
		
		////6666666
		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.util.ArrayList;
		import java.util.StringTokenizer;

		public class Main {

			public static void main(String[] args) throws Exception {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				StringTokenizer st;

				int num = Integer.parseInt(br.readLine());
				String[] str = new String[num];
				int count = 0; // 합계
				int count2 =0;
				int nu = 0;
				
				for (int i = 0; i < str.length; i++) {

					str[i] = br.readLine();
				}

				for (int i = 0; i < str.length; i++) {
					count = 0;
					nu = 0;
					count2 =0;
					for (int j = 0; j < str[i].length(); j++) {
						char a = str[i].charAt(j);
						if (a == 'O') {
							count++;
							count2 += count;
						} else {
							count = 0;
						}
						
					}
					nu = count2;
					bw.write(String.valueOf(nu) + "\n");

				}
				
				bw.flush();
				bw.close();

			}

		}
	}

	
	
	//////77777///
	
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
			String[] str = new String[num];

			for (int i = 0; i < str.length; i++) {
				st = new StringTokenizer(br.readLine());

				double sum = 0;
				int[] arr = new int[Integer.parseInt(st.nextToken())];
				double count = arr.length;

				for (int j = 0; j < arr.length; j++) {

					arr[j] = Integer.parseInt(st.nextToken());

					sum += arr[j];
				}

				double avg = sum / count;

				double countnum = 0; // 평균넘는 애들 체크
				for (int j = 0; j < arr.length; j++) {

					if (arr[j] > avg) {
						countnum++;
					}
				}

				double result = countnum / count * 100;
				//DecimalFormat df = new DecimalFormat("##.000");
				//String key = df.format(result);
				//bw.write(key +"%"+"\n");
				System.out.println(String.format("%.3f%%", result));
				
				
			}

			//bw.flush();
			//bw.close();
		}

	}
}
