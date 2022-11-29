package ch13.sec02.exam03;

public class Box <T>{ 
	public T content;
	
	public boolean compare(Box<T> other) { // 인스턴스화된 객체가 오겠구나 -> 무조건 인스턴스화된 객체
	boolean result = content.equals(other.content);
	return result;
	}
}
