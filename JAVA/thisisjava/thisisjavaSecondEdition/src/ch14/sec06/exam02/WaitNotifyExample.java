package ch14.sec06.exam02;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA ta = new ThreadA(workObject);
		ThreadB tb = new ThreadB(workObject);
		
		ta.start();
		tb.start();
		
	}

}
