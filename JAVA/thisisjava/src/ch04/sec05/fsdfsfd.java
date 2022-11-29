package ch04.sec05;

public class fsdfsfd {
	static int sum1=0;
	static int sum2=0;
	public static void main(String[] args) {
		int[]scores;
		
		scores = new int[] {73,80,77};
		
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
			System.out.println("score["+i+"] "+scores[i]);
		}
		System.out.println("총합: "+sum1);
		
		
		printItem(new int[] {83,90,87});
	}
	public static void printItem(int[] scores) {
		for(int i=0; i<3; i++) {
			sum2 += scores[i];
			System.out.println("score["+i+"] "+scores[i]);
		}
		System.out.println("총합: "+sum2);
	}
}
