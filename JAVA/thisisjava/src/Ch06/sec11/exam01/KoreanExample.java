package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {
		Korean kor = new Korean("123456-1234567","정지훈");
		
		System.out.println(kor.nation);
		System.out.println(kor.ssn);
		System.out.println(kor.name);
		
		kor.name="김자바";
	}

}
