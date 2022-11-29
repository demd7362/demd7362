package ch05.sec05;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); // 프로그래밍이 시작하는 인덱스 = 3
		System.out.println(location);
		String substring = subject.substring(location); // 문자열 잘라내기, 3번부터 끝까지를 뺸 나머지를 잘라냄 -> 프로그래밍
		System.out.println(substring);
		
		location = subject.indexOf("자바");
		if(location != -1) { // "자바"가 포함되어있지 않다면 -1, 
			// != -1 -> 포함되어있다
			System.out.println("자바와 관련 있는 책이군요");
		} else System.out.println("자바와 관련 없는 책이군요");
		
		boolean result = subject.contains("자바");
		
		if(result==true) {
			System.out.println("자바와 관련 있는 책이군요");
		} else System.out.println("자바와 관련 없는 책이군요");

	}

}
