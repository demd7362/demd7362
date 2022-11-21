package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실행 객체 생성
		Driver driver = new Driver(); // 클래스를 인스턴스화해서 객체를 가져왔는데 비해
		
		//구현 객체 생성
		Taxi taxi = new Taxi();
		// Taxi taxi;는 아직 객체생성이 안됐기때문에 사용할 수가 없다
		Bus bus = new Bus();
		
		Vehicle vehicle = bus;
		
		driver.drive(vehicle);
		driver.drive(bus);
		driver.drive(taxi);
	}

}
