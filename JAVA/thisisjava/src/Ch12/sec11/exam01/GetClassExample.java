package ch12.sec11.exam01;

public class GetClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		Class cls1 = Car.class;
		Class cls2 = Class.forName("ch12.sec11.exam01.Car");
		Car car = new Car();
		Class cls3 = car.getClass();
		
		System.out.println("패키지: "+cls1.getPackage().getName());
		System.out.println("패키지: "+cls3.getPackage());
		System.out.println("패키지: "+cls2.getPackageName());
		System.out.println("클래스 간단 이름: "+cls2.getSimpleName());
		System.out.println("클래스 경로 포함 이름 : "+cls3.getName());

	}

}
