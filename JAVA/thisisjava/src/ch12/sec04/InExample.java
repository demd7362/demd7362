package ch12.sec04;

import java.io.IOException;

public class InExample {

	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keyCode = 0;
		
		while(true)	{
			
			
			System.out.println("------------------");
			System.out.println("1.증속 2.감속 3.중지");
			System.out.println("------------------");
			System.out.println("현재 속도=" +speed);
			System.out.println("선택: ");
			keyCode = System.in.read(); // 키를 하나씩 읽음
			//enter key를 읽지 않았을 경우에만 실행
			if(keyCode != 13 && keyCode != 10) {
				if(keyCode == 49) {
					speed++;
				} else if(keyCode == 50) {
					speed--;
				} else if (keyCode == 51) {
					break;
				}
				
			}
			
		
		}
		
		System.out.println("프로그램 종료");

	}

}
