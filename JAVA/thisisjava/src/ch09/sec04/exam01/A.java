package ch09.sec04.exam01;

public class A {
	A(){ // 로컬 클래스의 정의
		class B{} // 생성자에서 생성
		
		B b = new B();
		
		
	}
	
	void method() {
		class B{} // 메소드에서 생성
		B b = new B();
	}
}
