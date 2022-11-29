package ch07.sec06.package1;

public class B {
	A a = new A();
	
	public void method() {
		A a = new A();
		this.a.field = "value";
		a.field = "value";
		a.method();
		
	}
}
