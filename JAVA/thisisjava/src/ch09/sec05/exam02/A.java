package ch09.sec05.exam02;

public class A {
	String field = "A-field";
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		String field = "B-field";
		void method() {
			System.out.println("---------B-method");
		}
	
	
	void print() {
		System.out.println(this.field); //B
		this.method(); //B
		
		System.out.println(A.this.field); //A
		A.this.method(); //A
		
		System.out.println(field); //B
		method(); //B
		
		System.out.println(A.this.field); //A
		A.this.method(); //A
	}
	}
	
	void UseB() {
		B b = new B();
		b.print();
	}
}
