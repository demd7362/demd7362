package ch04.sec07;

public class BreakOuterExample {

	public static void main(String[] args) {
		outer: for(char upper = 'A'; upper <= 'Z'; upper++) {
			
			for(char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				
				if(lower=='g') {
					break;
					//break outer;
					
				}
				System.out.println("안쪽 for문 출력");
			} // end of inner
			System.out.println("바깥쪽 for문 출력");
			
		} // end of outer
		
		System.out.println("종료");
	}

}
