package ch14.sec06.exam02;

public class WorkObject {
	synchronized void methodA() {
		System.out.println(Thread.currentThread().getName()+": methodA 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	synchronized void methodB(){
		System.out.println(Thread.currentThread().getName()+": methodB 작업 실행");
		notify();
		
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
