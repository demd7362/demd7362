package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplClass impl = new ImplClass();
		
		InterfaceA ia = impl;
		InterfaceB ib = impl;
		InterfaceC ic = impl;

		System.out.println();
		
		ia.methodA();
		System.out.println();
		ib.methodA();
		ib.methodB();
		System.out.println();
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
