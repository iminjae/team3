package team3.com.kh.codingTest.dayeong.ch02;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        int H = sc.nextInt();
//        int M = sc.nextInt();
//        
//        int new_H = H;
//        int new_M = M-45;
//        //45분을 뺐을때 0보다 작으면 시간에서도 1을 빼주고 분을 다시 구한다
//        if(new_M < 0){
//            new_H = H-1;
//            new_M = 60+new_M;
//        }
//        //시간이 음수일때 23시로 가야함
//        if(new_H < 0){
//            new_H = 23;
//        }
//        System.out.println(new_H+" "+new_M);
//    }
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        int new_H = H;
        int new_M = M-45;
        //45분을 뺐을때 0보다 작으면 시간에서도 1을 빼주고 분을 다시 구한다
        if(new_M < 0){
            new_H = H-1;
            new_M = 60+new_M;
        }
        //시간이 음수일때 23시로 가야함
        if(new_H < 0){
            new_H = 23;
        }
        System.out.println(new_H+" "+new_M);
    }
}

	
	
	
	
	
	
	
	
	

