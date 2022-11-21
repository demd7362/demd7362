package ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수";
		String []arr = data1.split("&|,"); // 띄어쓰기 불가능
		for(String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 = "홍길동&이수홍|박연수,정지훈";
		StringTokenizer st = new StringTokenizer(data2,"| | & | ,"); // 띄어쓰기 가능
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		
	}

}
