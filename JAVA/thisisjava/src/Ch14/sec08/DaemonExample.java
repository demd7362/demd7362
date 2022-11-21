package ch14.sec08;

public class DaemonExample {

	public static void main(String[] args) {
		AutoSaveThread ast = new AutoSaveThread();
		ast.setDaemon(true);
		ast.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료와 함께 데몬 스레드 ast도 함께 종료");
		
		
	}

}
