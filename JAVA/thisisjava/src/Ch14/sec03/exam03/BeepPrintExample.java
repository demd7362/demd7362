package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		Thread thread = new Thread() { 
			// runnable은 인터페이스고 thread라는 그걸 구현하고 있는 클래스를 익명자식객체로 오버라이딩
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {}
				}
			}
		};
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
			
		}

	}

}
