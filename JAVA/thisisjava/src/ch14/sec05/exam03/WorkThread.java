package ch14.sec05.exam03;

public class WorkThread extends Thread{
	boolean work = true;
	
	WorkThread(String name){
		setName(name);
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(work==true) {
				System.out.println(getName()+"작업 처리");
			} else Thread.yield();
		}
	}
	
	
	
}