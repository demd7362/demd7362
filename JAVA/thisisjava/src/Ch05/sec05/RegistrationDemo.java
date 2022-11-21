package ch05.sec05;

import java.util.Random;
import java.util.Scanner;

class ArrayFill{
	
	public int[] fill(int j) {
		int[] date = new int[j];
		int i;
		for(i=0; i<j; i++) {
			
			date[i] = i+1;
			
		}
		return date;
	}
	
	
}

public class RegistrationDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		ArrayFill date = new ArrayFill();
		int[] yy = date.fill(100);
		int[] mm = date.fill(12);
		int[] dd = date.fill(30);
		String y,m,d,sex,hometown,center,number,last;
		
		
		
		
		boolean run = true;
		while(run) {
		System.out.println("-----------------");
		System.out.println("1.주민등록번호 생성\n2.주민등록번호 분석\n3.주민등록번호 관리");
		System.out.println("-----------------");
		int inputFirst = sc.nextInt();
		if(inputFirst==1) {
			System.out.println("-----------------");
			System.out.println("1.무작위 생성\n2.임의로 생성");
			System.out.println("-----------------");
			int inputSecond = sc.nextInt();
			if(inputSecond==1) {
				// 앞자리 시작
				int year = rd.nextInt(100)+1;
				int month = rd.nextInt(12)+1;
				int day = rd.nextInt(30)+1;
				
				if(year<10) {
					y = String.valueOf(year);
					y = "0"+y;
		
				} else {
					y = String.valueOf(year);
				}
				if(month<10) {
					m = String.valueOf(month);
					m = "0"+m;
					
				} else {
					m = String.valueOf(month);
					
				}
				if(day<10) {
					d = String.valueOf(day);
					d = "0"+d;
					
				} else {
					d = String.valueOf(day);
					
				}
				// 뒷자리 시작
				int A = rd.nextInt(2)+1; // 성별
				if(year<=22 && A == 1) { // 00~22년생 남자는 3으로 치환
					A = 3;
				} else if(year<=22 && A == 2) A = 4; // 00~22년생 여자는 4로 치환
				
				int B = rd.nextInt(96); // 출생 지역
				int C = rd.nextInt(99); // 주민센터 고유번호
				int D = rd.nextInt(5)+1;	// 출생신고 순서	
				String BtoString = String.valueOf(B);
				String CtoString = String.valueOf(C);
				if(B<10) {
					BtoString = "0"+BtoString;
				}
				if(C<10) {
					CtoString = "0"+CtoString;
				
				}
				String AtoString = String.valueOf(A);
				String DtoString = String.valueOf(D);
				var one = y.charAt(0);
				var two = y.charAt(1);
				var three = m.charAt(0);
				var four = m.charAt(1);
				var five = d.charAt(0);
				var six = d.charAt(1);
				var eight = BtoString.charAt(0);
				var nine = BtoString.charAt(1);
				var ten = CtoString.charAt(0);
				var eleven = CtoString.charAt(1);
				
				System.out.println("두자릿수를 반으로 나눈 결과: "+one);
				int oneLast = one*2;
				int twoLast = two*3;
				int threeLast = three*4;
				int fourLast = four*5;
				int fiveLast = five*6;
				int sixLast = six*7;
				int sevenLast = A*8;
				int eightLast = eight*9;
				int nineLast = nine*2;
				int tenLast = ten*3;
				int elevenLast = eleven*4;
				int twelve = D*5;
				
				
			System.out.println(one+"  one값 *2  "+oneLast);
				// 반으로 쪼갰는데 char가 돼서 마지막값은 랜덤변수로 해야할거같음
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				System.out.println("주민등록번호 앞자리"+ y+m+d);
				System.out.println("주민등록번호 뒷자리"+ AtoString+BtoString+CtoString+DtoString);
			}
		} // end of first if
		
		
		
		
		
		}
	}

}
