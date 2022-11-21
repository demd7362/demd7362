package ch14.sec05.exam03;

public class YieldExample {

	public static void main(String[] args) {
		WorkThread threadA = new WorkThread("ThreadA");
		WorkThread threadB = new WorkThread("ThreadB");
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work=false;
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadA.work=true;
	}

}
