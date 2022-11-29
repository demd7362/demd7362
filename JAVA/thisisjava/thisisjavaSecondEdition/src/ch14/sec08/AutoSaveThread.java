package ch14.sec08;

public class AutoSaveThread extends Thread{
	void save() {
		System.out.println("저장됨");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("interrupt 감지");
				break;
			}
			save();
		}
	}
	
}
