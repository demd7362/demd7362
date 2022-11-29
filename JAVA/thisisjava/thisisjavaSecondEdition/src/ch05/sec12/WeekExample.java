package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		Week today = null; // Week enum 타입 변수 선언
		
		Calendar cal = Calendar.getInstance(); // Calendar 얻기
		
		int week = cal.get(Calendar.DAY_OF_WEEK); // 1~7(일~토)까지의 숫자를 얻고 int타입 변수 week에 대입
		

		
		switch(week) { // 숫자(오늘 무슨 요일인지)를 enum 상수로 변환해서 변수에 대입
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		if(today== Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
			
		} else System.out.println("열심히 자바를 공부합니다"); System.out.println(week);
	}

}
