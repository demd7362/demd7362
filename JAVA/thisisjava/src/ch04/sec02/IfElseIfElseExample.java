package ch04.sec02;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 90점이상 입니다");
			System.out.println("등급은 A입니다");
		} else if(score>=80) {
			System.out.println("점수가 80~89점 입니다");
			System.out.println("등급은 B입니다");
		} else if(score>=70) {
			System.out.println("점수가 70~79점 입니다");
			System.out.println("등급은 C입니다");
		} else {
			System.out.println("점수가 70점미만 입니다");
			System.out.println("등급은 D입니다");
			}
		}

}
