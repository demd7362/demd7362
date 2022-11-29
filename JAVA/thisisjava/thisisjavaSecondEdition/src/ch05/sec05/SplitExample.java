package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		String board ="1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		String[] tokens = board.split(",");
		String[] titles = {"번호","제목","내용","설명"};
		String[] forTitles = null;
		String[] forTokens =null;
		while(true) {
			int i,j;
		for(i=0; i<tokens.length; i++) { // length는 메소드가 아닌 변수다
			forTokens = new String[tokens.length];
			forTokens[i] = tokens[i];
		}
		for(j=0; j<titles.length; j++) {
			forTitles = new String[titles.length];
			forTitles[j] = titles[j];
		}
		System.out.println(forTitles[j-1]+forTokens[i-1]);
		
		}
	}

}
