package ch11.sec05;

public class ThrowsExample1 {
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
	}
	public static void main(String[] args) { // throws Exception -> JVM이 받음 -> 예외처리안하는것과 같음
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("예외 처리: "+e.toString());
		}

	}

}
