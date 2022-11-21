package ch06.sec07.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car("그랜저","검정",250);
		Car myCar2 = new Car("제네시스","회색",350);
		System.out.println(myCar.model+myCar.color+myCar.maxSpeed);
		System.out.println(myCar2.model+myCar2.color+myCar2.maxSpeed);

	}

}
