package ch04.sec05;

public class String_C_L_R_S_I {

	public static void main(String[] args) {
		String C = "자바";
		System.out.println(C.charAt(1)); // 바
		
		String L = "자바";
		System.out.println(L.length()); // 2글자라서 2
		
		String R = "자바";
		System.out.println(R.replace("자바", "JAVA")); // 자바가 JAVA로 대체
	
		String S1 = "자바 프로그래밍"; // 0 1 2 3 4 5 6 7 
		System.out.println(S1.substring(4)); // 4번~끝 문자열 빼고 다 잘라라
		
		String S2 = "자바 프로그래밍";
		System.out.println(S2.substring(2,7)); // 2~7번 문자열빼고 다 잘라라
		
		String I = "자바 프로그래밍";
		System.out.println(I.indexOf("프로그래밍")); // 프로그래밍 이라는 문자열이 시작하는 위치를 찾아냄
		
		
		
		
	}

}
