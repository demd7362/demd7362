package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		System.out.println("모델명: "+myCar.model);
		System.out.println("시동여부: "+myCar.start);
		System.out.println("현재속도: "+myCar.speed);
		
		Car myCar2 = new Car();
		
		System.out.println("모델명: "+myCar2.model);
		System.out.println("시동여부: "+myCar2.start);
		System.out.println("현재속도: "+myCar2.speed);
		
	}
}
