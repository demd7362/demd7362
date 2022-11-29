package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		
		scores = new int[] {83,90,87};
		
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("종합: "+sum1);
		
		printItem(new int[] {83,90,87});
		printItem(scores);

	}
	
	public static void printItem(int[] scores) {
		for(int i = 0; i<scores.length; i++) {
		System.out.println("score["+i+"]: "+ scores[i]);
	}
	}
}
