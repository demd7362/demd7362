package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random rd = new Random();
		System.out.print("선택번호: ");
		for(int i=0; i<selectNumber.length; i++) {
			selectNumber[i] = rd.nextInt(45)+1;
			System.out.print(selectNumber[i] +" ");
		}
		System.out.println();
		
		
		int[] winningNumber = new int[6];
		rd = new Random(); // 종자값 같게 설정했다면 무조건 1등
		System.out.print("당첨번호: ");
		for(int i=0; i<winningNumber.length; i++) {
			winningNumber[i] = rd.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부: ");
		
		if(result) {
			System.out.println("1등 당첨");
		} else System.out.println("당첨되지 않았습니다");
	
	
	}

}
