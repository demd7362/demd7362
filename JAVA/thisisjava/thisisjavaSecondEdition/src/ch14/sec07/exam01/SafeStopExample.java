package ch14.sec07.exam01;

public class SafeStopExample {

	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		
		pt.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pt.setStop(true);

	}

}
