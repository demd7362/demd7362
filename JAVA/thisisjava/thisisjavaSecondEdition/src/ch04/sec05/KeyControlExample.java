package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int speed = 0;
		boolean run=true;
		
		while(run==true) {
			System.out.println("----------------------");
			System.out.println("1.증속 | 2.감속 | 3.중지");
			System.out.println("----------------------");
			System.out.println("선택 :");
			
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재 속도 = "+ speed);
			}
			else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재 속도 = "+speed);
			}
			else if(strNum.equals("3")) {
		
				run=false; // break문을 쓰면 아래 문장이 입력되지 않고 바로 while문을 빠져나오기 때문에
				// boolean값 true/false와 큰 차이가 있다
			}
			System.out.println("현재의 strNum 값 : "+strNum);
			
		}
		System.out.println("프로그램 종료");
	}

}
