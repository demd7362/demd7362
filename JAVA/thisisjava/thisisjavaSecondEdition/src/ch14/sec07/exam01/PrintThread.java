package ch14.sec07.exam01;

public class PrintThread extends Thread{
	private boolean stop;
	
	void setStop(boolean stop) {
		this.stop=stop;
	}

	@Override
	public void run() {
		while(!stop) {
			System.out.println("실행 중");
		}
		System.out.println("리소스 정리");
		System.out.println("작업 종료");
		
	}
	
	
}
