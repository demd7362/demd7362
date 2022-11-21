package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		
		
		sumThread.start();
		
		
		try {
			sumThread.join(); // 없으면 합 0 
		} catch (InterruptedException e) {} 
		
		System.out.println("1~100 합: "+ sumThread.getSum());

	}

}
