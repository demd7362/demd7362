package ch08.sec10.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a;
		
		a = b;
		a = c; 
		a = d;
		a = e;
		
		D d2 = (D) new B(); // D로 변수 d2 만들건데 객체B를 참조할거다

	}

}
