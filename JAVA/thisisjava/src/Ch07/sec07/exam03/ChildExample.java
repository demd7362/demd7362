package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // 부모 클래스의 메소드를 쓰고싶은데 자식의 오버라이드된 메소드만 가져와서 쓰고싶을때
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		
		Child child = (Child)parent; // ==    Child child = new Child();
		
		child.field1 = "data2";
		child.field2 = "data2";
		
		System.out.println("-----");
		child.method1();
		child.method2();
		child.method3();

	}

}
