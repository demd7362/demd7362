package ch14.sec07.exam02;

public class InterruptExample {

	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		
		pt.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		pt.interrupt();
	}

}
