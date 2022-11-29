package ch06.sec15;

public class SingletonPrac {
	private static SingletonPrac singleton = new SingletonPrac();
	
	private SingletonPrac() {
		
	}
	
	static SingletonPrac getInstance() {
		return singleton;
	}
}
