package team3.com.kh.codingTest.ms;

public class DimensionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int a[][] = new int[4][4];
		int count=1;
		for (int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				a[i][j]=count++;
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		/*
		int a[][] = new int[4][4];
		int count=16;
		for (int i =0;i<a.length;i++) {
			for(int j =0;j<a[i].length;j++) {
				a[i][j]=count--;
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		String b[][]= new String[3][3];
		for (int i =0;i<b.length;i++) {
			for(int j =0;j<b[i].length;j++) {
				b[i][j] = "("+i+", "+j+")";
				System.out.println(b[i][j]);
			}
			
		}
		
		*/
		int sum[][] = new int[4][4];
		
		for (int i =0;i<sum.length-1;i++) {
			for(int j =0;j<sum[i].length-1;j++) {
				sum[i][j]=(int)(Math.random()*10+1);
				System.out.print("sum[i][j]= "+sum[i][j]+" ");
				if(i==0)sum[0][3] += sum[0][j];
				if(i==1)sum[1][3] += sum[1][j];
				if(i==2)sum[2][3] += sum[2][j];
				
				if(j==0)sum[3][0] += sum[i][0];
				if(j==1)sum[3][1] += sum[i][1];
				if(j==2)sum[3][2] += sum[i][2];
				
				sum[3][3]= sum[3][0]+sum[3][1]+sum[3][2];
			}
			System.out.println();
			
		}

		for (int i =0;i<sum.length;i++) {
			
			
			for(int j =0;j<sum[i].length;j++) {

				System.out.print(sum[i][j]+" ");
	
			}
			System.out.println();
		}
		
		int a []=new int[] {1,2,3,4,5} ;
	}
	
}
