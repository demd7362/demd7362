package ch13.sec02.exam02;

public class GenericExample {

	public static void main(String[] args) {
		
		Home home = new Home(); 
		home.turOnLight();
		
		
		CarAgency carAgency = new CarAgency(); // 근데 그 객체를 생성하려면 carAgency 객체생성필요
		Car car = carAgency.rent(); // rent메소드로 new Car() 객체를 생성
		car.run();
	}

}
