package ch09.sec02.exam01;

public class A {
	class B{}
	
	B field = new B(); // 필드에서 객체 생성
	
	A(){
		B b = new B(); // 생성자에서 객체 생성
	}
	
	void method() {
		B b = new B(); // 인스턴스 메소드에서 객체 생성
	}
}
