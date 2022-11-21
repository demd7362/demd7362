package ch04.sec07;

import java.util.Random;

public class BreakExample {

	public static void main(String[] args) {
		Random rd = new Random();
		while(true) {
			
			int num = rd.nextInt(6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
			System.out.println("6이 아닙니다\n");
		}
		System.out.println("프로그램 종료");
	}

}
