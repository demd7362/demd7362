package ch12.sec04;

public class ErrExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value = Integer.parseInt("1oo");
		} catch ( NumberFormatException e ) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
			System.err.println(e.toString());
			
		}
	}

}
