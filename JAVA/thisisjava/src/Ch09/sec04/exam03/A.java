package ch09.sec04.exam03;

public class A {
	public void method1(int arg) {
		int var = 1;
//		var = 3; <- 가능. 
		class B {
			void method2() {
				
//				var = 3;
//				arg = 3; <- 불가능. 로컬 클래스 안이라서
				System.out.println("arg: "+arg);
				System.out.println("var: "+var);
			}
		} // end of B
		
		B b = new B();
		b.method2();
	}
}
