package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date now = new Date(); // 현재 날짜,시간 가져옴
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm.ss"); // 데이터 포장
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);

	}

}


// date,sdf= 짝