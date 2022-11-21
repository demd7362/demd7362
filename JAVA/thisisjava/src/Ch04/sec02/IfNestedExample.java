package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*20)+81;
		System.out.println("점수: "+score);
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else { // 90이상 95미만
				grade = "A";
			}
		}
		else { // 90점이 넘지 않을 때에는,
			if(score>=85) { // 85점이상 90점미만
				grade = "B+";
				
			} // 85점미만
			else grade = "B"; 
		}
		
		System.out.println("학점: "+grade);
	}

}
