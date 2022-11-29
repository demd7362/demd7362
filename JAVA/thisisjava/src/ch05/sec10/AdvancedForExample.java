package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0 ;
		for(int score : scores) {
			System.out.println(score); // 5개의 항목이 한번씩 score 변수에 저장되고 sum에 누적됨. 반복 횟수 5
			
			sum += score;
			
			System.out.println(sum);
		}
		System.out.println("점수 총합 = "+sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 = "+avg);

	}

}
