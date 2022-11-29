package ch04.sec02;

import java.util.Scanner;

public class Quiz7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int pocket = 100000;
		int account = 10000;
		
		
		while(true) {
			
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.println("현재 보유중인 현금이 "+pocket+"원 있습니다");
			String select = sc.nextLine();
			
		if(select.equals("1")) {
			System.out.println("선택> "+select);
			System.out.println("예금액> ");
			String moneyIn = sc.nextLine();
			int moneyInToInt = Integer.parseInt(moneyIn);
			
			if(moneyInToInt<=pocket) {
			account +=moneyInToInt;
			pocket-=moneyInToInt;
			System.out.println("현재 계좌 잔고는 "+account+"원 입니다");
			
			continue;
			} else {
				System.out.println("현재 현금이 "+pocket+"원밖에 없습니다\n"+-(pocket-moneyInToInt)+"원 모자랍니다");
				
			}
			
		}
		if(select.equals("2")) {
			System.out.println("선택> "+select);
			System.out.println("출금액> ");
			String moneyOut = sc.nextLine();
			int moneyOutToInt = Integer.parseInt(moneyOut);
			
			if(moneyOutToInt<=account) {
			account -=moneyOutToInt;
			pocket +=moneyOutToInt;
			System.out.println("현재 계좌 잔고는 "+account+"원 입니다");
			
			continue;
			} else {
				System.out.println("계좌에 금액이 " + (moneyOutToInt-account)+"원 부족합니다");
				
				}
			}
		if(select.equals("3")) {
			System.out.println("선택> "+select);
			System.out.println("잔고> "+account);
			
			continue;
		}
		if(select.equals("4")) {
			System.out.println("선택> "+select);
			System.out.println("프로그램을 종료합니다");
			
			break;
		}
		
		
		System.out.println("다시 입력해주세요");
		
		
		}
	}

}