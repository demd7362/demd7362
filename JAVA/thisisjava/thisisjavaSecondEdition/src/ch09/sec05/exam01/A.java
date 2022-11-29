package ch09.sec05.exam01;

public class A {
	int field1;
	void method1() {}
	
	
	static int field2;
	static void method2() {}
	
	class B { //인스턴스 멤버 클래스 생성
		void method() {
			field1=10;
			method1();
			field2=10;
			method2();
		}
	}
	
	static class C {
		void method() {
//			field1=10;
//			method1(); // 스->인 X
			field2=10; // 스->스 O
			method2();
		}
	}
}
