package ch06.sec15;

public class Singleton {
	private static Singleton st = new Singleton(); // 세터
	
	private Singleton() { // 자동으로 만들면 퍼블릭
		
	}
	
	public static Singleton getInstance() { // 게터, 리턴타입 Singleton 
		return st;
	}
}
