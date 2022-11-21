package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		// cal = 공유객체
		User1Thread user1Thread = new User1Thread();
		User2Thread user2Thread = new User2Thread();
		user1Thread.setCalculator(cal);
		user2Thread.setCalculator(cal);
		user1Thread.start();
		user2Thread.start();
	}

}
