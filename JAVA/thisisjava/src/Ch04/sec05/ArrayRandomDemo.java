package ch04.sec05;

import java.util.Random;

public class ArrayRandomDemo {

	static void printItem(int[] scores) {
		
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		int score = 0; // 점수
		int sum = 0; // 점수의 합
		int i;
		String[] firstname = {"김","이","박","최","정","윤","양","한"};
		String[] secondname = {"관식","명훈","지훈","민혁","승원","호상","도현","기정"};
		String rank = null;
		
		for(i = 1; i<=30; i++) { // i=학생 수 
			score = (rd.nextInt(40,101)); // 30명의 학생 한명한명의 점수 임의로 산출 40~100
			if(score>=90) {
				rank = "A";
			} else if(score>=80) rank = "B";
			else if(score>=70) rank = "C";
			else rank = "낙제";
			System.out.println(i+"번 학생 "+firstname[rd.nextInt(8)]+secondname[rd.nextInt(6)]+"의 점수:"+score);
			System.out.println("이 학생의 등급은 "+rank+"입니다\n");
			sum +=score;
		}
		System.out.println("학생 수 "+(i-1)+"명\n이 반의 평균 점수: "+(sum/(i-1))+"점");
		
		
		String[] a;
		a = new String[] {"1","2","3"}; // 선언하고 바로 초기화하지않으면 new 붙여줘야함
		
		String[] b= {"1","2","3"};
		
		printItem(new int[] {1,2,3}); // 메소드에서 배열을 이미 선언했기 때문에 괄호 안의 값은 String a와 같음
	}

}
