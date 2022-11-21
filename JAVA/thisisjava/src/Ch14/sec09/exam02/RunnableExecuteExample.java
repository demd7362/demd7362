package ch14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		String[][] mails = new String[1000][3];
		

		for(int i=0; i<mails.length; i++) {

			mails[i][0] = "admin@my.com";
			mails[i][1] = "member"+i+"@my.com";
			mails[i][2] = "신상품 입고";
			
		}

		ExecutorService es = Executors.newFixedThreadPool(5); // 사라지지않는 최대 5개의 스레드풀 생성
		
		for(int i=0; i<mails.length; i++) {
			final int idx = i;
			es.execute(new Runnable() {

				@Override
				public void run() {
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					
					System.out.println("["+Thread.currentThread().getName()+"]"+from+" ==>"+to+": "+content);
					
				}
				
				
				
				
				
				
				
				
				
			});
		}
		es.shutdown();
	}

}
