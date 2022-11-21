package ch04.sec05;

public class String_split {

	public static void main(String[] args) {
		String B = "번호 and 제목 and 내용 and 글쓴이";
		String[] tokens = B.split(" and ");
		for(int i=0; i<tokens.length; i++) {
		System.out.println(tokens[i]);	
		}

	}

}
