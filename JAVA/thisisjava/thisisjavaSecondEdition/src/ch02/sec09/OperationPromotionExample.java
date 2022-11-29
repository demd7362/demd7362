package ch02.sec09;

import java.util.Scanner;

public class OperationPromotionExample {

	public static void main(String[] args) {
		byte result1 = 10 + 20 ;
		System.out.println("result1 :"+result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1+v2;
		// int 타입보다 작은 byte,short타입의 변수는 int 타입으로 자동변환되어 연산을 수행한다.
		System.out.println("result2 :"+ result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000;
		long result3 = v3 + v4 + v5;
		System.out.println("result3 :"+result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6+v7;
		System.out.println("result4 :"+result4);
		System.out.println("result4 :"+(char)result4);
		
		int v8 = 10; 
		int result5 = v8/(int)4.0;
		//  int result5 = v8/4.0;            
		//  4대신 4.0을 입력하면 연산되지 않음
		System.out.println("result5 :"+result5);
		
		int v9 = 10;
		double result6 = v9/4.0;
		// 4.0이 실수라서 2.5 정수라면 2.0
		System.out.println("result6 :"+result6);
		
		int v10= 1;
		int v11= 2;
		double result7 = (double)v10/v11;
		// 이것도 한쪽이 실수라면 0.5
		System.out.println("result7 :"+result7);
		
		System.out.printf("나이:%.1f", 28.7);
		
		System.out.printf("\n\n이름:%s\n나이:%.1f\n만 %d세\n성별:%s\n", "정지훈",28.7,26,"남성");
		
		double value = 123.456789;
		System.out.printf("상품의 가격:%011f원\n",value);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("x값 입력: ");
		String strX = sc.next();
		int x = Integer.parseInt(strX);
		
		System.out.println("y값 입력: ");
		String strY = sc.next();
		int y = Integer.parseInt(strY);
		
		int result = x + y;
		System.out.println("x+y="+result);
		
		
	}

}
