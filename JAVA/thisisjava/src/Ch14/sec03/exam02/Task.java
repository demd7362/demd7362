package ch14.sec03.exam02;

import java.awt.Toolkit;

public class Task implements Runnable{
	public void run() {
		Toolkit toolkit = 
				Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
